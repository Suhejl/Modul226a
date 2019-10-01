package ch.tbz.modul226.modul226a.filmstars;

public class Main {
  StarManager starManager = new StarManager();

  public static void main(String[] args) {
    Menu menu = new Menu();

    menu.runManager();
    }




 /*   public Star getStar() {
      String lastName = "";
      Scanner scan = new Scanner(System.in);

      System.out.print("Lastname of star you want to delete\n>");
      lastName = scan.nextLine();
      for (Star star : starManager.starList) {
        if (star.getLastName().equals(lastName)) {
          return star;
        }
      }
      return null;
    }*/

  }
