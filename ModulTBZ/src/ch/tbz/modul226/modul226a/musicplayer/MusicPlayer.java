package ch.tbz.modul226.modul226a.musicplayer;

import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * This is the class MusicPlayer. It has methods for playing, shuffling, deleting and stopping music
 * @author suhejl
 * @version 1.0
 * */
public class MusicPlayer {
  public ArrayList<Music> musicList = new ArrayList<>();
  private String musicURL;
  private BasicPlayer player = new BasicPlayer();
  private File folder;

  public MusicPlayer(String musicURL) {
    this.musicURL = musicURL;
    folder = new File(musicURL);
    folder.listFiles(i -> i.isFile() && musicList.add(new Music(i.getName(), musicURL)));
    musicList.sort(Comparator.comparing(Music::getName));
  }

  public void showMusic() {
    for (int i = 0; i < musicList.size(); i++) {
      System.out.println(i + 1 + ".\t" + musicList.get(i).getName());
    }
  }

  public void playMusic(int id) {
    try {
      player.stop();
      selectMusic(musicList, id);
    } catch (BasicPlayerException basicex) {
      basicex.printStackTrace();
    }
  }

  public void shuffleMusic() {
    ArrayList<Music> secondList = new ArrayList<>(musicList);
    Collections.shuffle(secondList);
    stopMusic();
    selectMusic(secondList, 0);
  }

  private void selectMusic(ArrayList<Music> list, int id) {
    String songName = list.get(id).getName();
    try {
      player.open(new URL("file:///" + musicURL + "/" + songName));
      player.play();
    } catch (BasicPlayerException | MalformedURLException e) {
      e.printStackTrace();
    }
  }

  public void stopMusic() {
    try {
      player.stop();
    } catch (BasicPlayerException basicex) {
      basicex.printStackTrace();
    }
  }

  public File stopToDeleteMusic(int id) {
    stopMusic();
    File file = new File(folder + "/" + musicList.get(id).getName());
    ;
    return file;
  }

  public void deleteMusic(int id) {
    File file = stopToDeleteMusic(id);
    if (file.isFile()) {
      file.delete();
    }
    musicList.remove(id);
  }
}
