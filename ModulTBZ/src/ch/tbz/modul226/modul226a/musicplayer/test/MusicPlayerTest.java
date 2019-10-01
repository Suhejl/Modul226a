package ch.tbz.modul226.modul226a.musicplayer.test;

import ch.tbz.modul226.modul226a.musicplayer.Music;
import ch.tbz.modul226.modul226a.musicplayer.MusicPlayer;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.File;
/*
 * This is the Unit test from the class MusicPlayer
 *
 * @author suhejl
 * @version 1.0
* */
public class MusicPlayerTest {
  private MusicPlayer musicPlayer;

  @BeforeMethod
  public void setUp(){
    musicPlayer = new MusicPlayer("C:/Work/Source/projectsintelliJ/ModulTBZ" +
        "/src/music");
    musicPlayer.musicList.clear();
  }

  @Test
  public void stopToDeleteMusic_ID1_Test(){
    File file = new File("C:/Work/Source/projectsintelliJ/ModulTBZ" +
        "/src/music/Maestro - HAYATIM (prod. by Emde51).mp3");
    musicPlayer.musicList.add(new Music(file.getName(), file.getPath()));
    File deleteFile = musicPlayer.stopToDeleteMusic(0);
    Assert.assertEquals(deleteFile, file);
  }
}
