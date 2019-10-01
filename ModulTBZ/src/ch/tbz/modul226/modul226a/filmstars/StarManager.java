package ch.tbz.modul226.modul226a.filmstars;

import java.util.ArrayList;
import java.util.Comparator;

public class StarManager {
  ArrayList<Star> starList = new ArrayList<>();

  public void addStar(int max) {
    for (int i = 0; i < max; i++) {
      Star star = Menu.getStarData();
      starList.add(star);
    }
  }

  public void printStar() throws EmptyStarListException {
    if (starList.size() != 0) {
      starList.sort(Comparator.comparing(Star::getLastName));
      for (Star star : starList) {
        System.out.println("\nFirstname: " + star.getFirstName() + "\nLastname: " + star.getLastName() + "\nFilmname: " + star.getFilmName() + "\n--------------------------------------------------------------------\n");
      }
    } else {
      throw new EmptyStarListException("Starlist is empty");
    }
  }

  public void removeStar(String firstName, String lastName) {
    if (!starList.isEmpty()) {
      for (int i = 0; i < starList.size(); i++) {
        if (firstName.equalsIgnoreCase(starList.get(i).getFirstName()) && lastName.equalsIgnoreCase(starList.get(i).getLastName())) {
          starList.remove(starList.get(i));
        }
      }
    } else{
      System.out.println("No star to remove");
    }
  }

  public void query(Star star) {
    System.out.println("\nFirstname: " + star.getFirstName() + "\nLastname: " + star.getLastName() + "\n");
  }
}
