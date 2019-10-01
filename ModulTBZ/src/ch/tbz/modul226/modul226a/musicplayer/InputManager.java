package ch.tbz.modul226.modul226a.musicplayer;

import java.util.Scanner;

/*
 * This is the class InputManager. It manages the input of the user.
 * @author suhejl
 * @version 1.0
 * */

public class InputManager {
  Scanner scan = new Scanner(System.in);
  MusicPlayer musicPlayer;
  private String musicURL = "C:/Work/Source/projectsintelliJ/ModulTBZ" +
      "/src/music";

  public InputManager() {
    musicPlayer = new MusicPlayer(musicURL);
  }

  private int menu() {
    int getChoice;
    boolean isWrongInput = false;
    do {
      isWrongInput = false;
      getChoice = 0;
      String menu = "\nChoose your action\n" +
          "[1] Show Music\n" +
          "[2] Play Music\n" +
          "[3] Shuffle Play Music\n" +
          "[4] Stop Music\n" +
          "[5] Delete Music\n" +
          "[0] Close MusicPlayer\n>";
      System.out.println(menu);
      try {
        getChoice = Integer.parseInt(scan.nextLine());
      } catch (NumberFormatException nuex) {
        System.out.println("Invalid input");
        isWrongInput = true;
      }
    } while (isWrongInput);
    return getChoice;
  }

  private boolean selectChoice(int choice) {
    switch (choice) {
      case 1:
        musicPlayer.showMusic();
        break;
      case 2:
        int idPlayMusic = getMusicId();
        musicPlayer.playMusic(idPlayMusic);
        break;
      case 3:
        musicPlayer.shuffleMusic();
        break;
      case 4:
        musicPlayer.stopMusic();
        break;
      case 5:
        int idDeleteMusic = getMusicId();
        musicPlayer.deleteMusic(idDeleteMusic);
        break;
      case 0:
        musicPlayer.stopMusic();
        return false;
      default:
        System.out.println("Invalid Input for Switch Case");
    }
    return true;
  }

  private int getMusicId() {
    int id = 0;
    try {
      System.out.print("Select Music by ID\n>");
      id = Integer.parseInt(scan.nextLine());
    } catch (NumberFormatException nuex) {
      System.out.println("Invalid Input");
    }
    return id - 1;
  }

  public void startManager() {
    boolean isRunning = false;
    do {
      int getChoice = menu();
      isRunning = selectChoice(getChoice);
    } while (isRunning);
  }
}
