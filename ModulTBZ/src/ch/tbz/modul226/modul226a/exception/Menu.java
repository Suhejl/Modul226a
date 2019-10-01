package ch.tbz.modul226.modul226a.exception;

import java.util.Scanner;

public class Menu {
  Scanner scan = new Scanner(System.in);
  private int menu() {
    int choice = 0;
    boolean isWrongInput = false;
    do {
      System.out.print("What's better?");
      String menu = "\n[1] PC" +
          "\n[2] Console\n>";
      System.out.println(menu);
      try {
        choice = Integer.parseInt(scan.nextLine());
      } catch (NumberFormatException nuex) {
        System.out.println("Wrong input");
        isWrongInput = true;
      }
    } while (isWrongInput);
    return choice;
  }

  public void manageOpinion() {
    try {
      manageWrongOpinion();
    } catch (WrongOpinionException wrex) {
      System.out.println(wrex.getMessage());
    }

  }

  private void manageWrongOpinion() throws WrongOpinionException{
    int getChoice = menu();

    switch (getChoice) {
      case 1:
        System.out.println("Good Choice");
        break;
      case 2:
        throw new WrongOpinionException("Your opinion is worng");
      default:
        System.out.println("Wrong input");
    }
  }
}
