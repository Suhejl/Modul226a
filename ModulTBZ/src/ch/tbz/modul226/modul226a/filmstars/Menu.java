package ch.tbz.modul226.modul226a.filmstars;

import java.util.Scanner;

public class Menu {
  private StarManager starManager = new StarManager();
  private Scanner scan = new Scanner(System.in);
  private static final int MAX_STARS = 10;

  private int menu() {
    Scanner scan = new Scanner(System.in);
    int getChoice = 0;
    boolean isWrongInput = false;
    do {
      System.out.println("Choose what you want to do");
      System.out.print("[1] Add star" +
          "\n[2] Print star" +
          "\n[3] Remove star" +
          "\n[4] Make queries\n>");
      try {
        getChoice = Integer.parseInt(scan.nextLine());
      } catch (NumberFormatException nuex) {
        System.out.println("Wrong input");
        isWrongInput = true;
      }
    } while (isWrongInput);

    return getChoice;
  }

  public void runManager() {
    Scanner scan = new Scanner(System.in);
    boolean isRunning = false;
    boolean isWrongInput = false;
    do {
      int getChoice = menu();
      switchCaseChoice(getChoice);
      System.out.print("Do you want to continue? [\"true\" to continue]\n>");
      isRunning = Boolean.parseBoolean(scan.nextLine());
    } while (isRunning);
  }

  private Star getStarfromQuery() throws NullPointerException {
    String query;
    Scanner scan = new Scanner(System.in);

    System.out.print("Write a query\n>");
    query = scan.nextLine();
    for (Star star : starManager.starList) {
      if (query.contains(star.getFilmName())) {
        return star;
      }
    }
    return null;
  }

  private int getNumberofStars() throws StarLimitException {

    int numberOfStars = 0;
    boolean isWrongInput = false;
    do {
      isWrongInput = false;
      try {
        System.out.print("Set the number of stars you want to add (Max. 10)\n>");
        numberOfStars = Integer.parseInt(scan.nextLine());
        if (numberOfStars > MAX_STARS) {
          throw new StarLimitException("You exceeded the Limit of stars");
        }
      } catch (NumberFormatException numEx) {
        System.out.println("Ungültige Eingabe\n");
        isWrongInput = true;
      }
    } while (isWrongInput);
    return numberOfStars;
  }

  private void switchCaseChoice(int choice) {
    switch (choice) {
      case 1:
        int getNumber = 0;
        try {
          getNumber = getNumberofStars();
        } catch (StarLimitException stex) {
          System.out.println(stex.getMessage());
        }
        starManager.addStar(getNumber);
        break;
      case 2:
        try {
          starManager.printStar();
        } catch (EmptyStarListException emex) {
          System.out.println(emex.getMessage());
        }
        break;
      case 3:
        if (starManager.starList.isEmpty()) {
          System.out.println("No star in the list to remove");
          break;
        }
        String[] names = getNames();
        int firstName = 0;
        int lastName = 1;
        if (names[firstName] != null && names[lastName] != null) {
          starManager.removeStar(names[firstName], names[lastName]);
        } else {
          System.out.println("No star with such a first or lastname\n");
        }
        break;
      case 4:
        if (starManager.starList.isEmpty()) {
          System.out.println("No star in the list to make a query");
          break;
        }
        try {
          Star star = getStarfromQuery();
          starManager.query(star);
          break;
        } catch (NullPointerException nuex) {
          System.out.println("Query doesn't contain concrete information");
        }
      default:
        System.out.println("Problem\n");
    }
  }

  private String[] getNames() {
    String firstName = null;
    String lastName = null;
    System.out.println("\nWrite down the data of the star you want to remove");
    do {
      System.out.print("Firstname: ");
      firstName = scan.nextLine();
    } while (firstName == null);

    do {
      System.out.print("Lastname");
      lastName = scan.nextLine();
    } while (lastName == null);

    String[] names = {firstName, lastName};
    return names;
  }

  public static Star getStarData() {
    Scanner scan = new Scanner(System.in);

    String firstName = "";
    String lastName = "";
    String filmName = "";
    boolean isWrongInput = false;
    do {
      try {
        isWrongInput = false;
        System.out.print("Enter the first name of the star\n>");
        firstName = scan.nextLine();
        if (firstName == null) {
          isWrongInput = true;
        }
      } catch (NumberFormatException nuex) {
        System.out.println("Wrong input");
        isWrongInput = true;
      }
    } while (isWrongInput);
    System.out.println("\n");
    do {
      try {
        isWrongInput = false;
        System.out.print("Enter the last name of the star\n>");
        lastName = scan.nextLine();
        if (lastName == null) {
          isWrongInput = true;
        }
      } catch (NumberFormatException nuex) {
        System.out.println("Wrong Input");
        isWrongInput = true;
      }
    } while (isWrongInput);
    System.out.println("\n");
    do {
      try {
        isWrongInput = false;
        System.out.print("Enter the film name of the star\n>");
        filmName = scan.nextLine();
        if (filmName == null) {
          isWrongInput = true;
        }
      } catch (NumberFormatException nuex) {
        System.out.println("Wrong Input");
        isWrongInput = true;
      }
    } while (isWrongInput);

    System.out.println("\n\n\n");

    Star star = new Star(firstName, lastName, filmName);
    return star;
  }
}

