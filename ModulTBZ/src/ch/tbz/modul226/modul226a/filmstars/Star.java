package ch.tbz.modul226.modul226a.filmstars;

public class Star {
  private String firstName;
  private String lastName;
  private String filmName;

  public Star(String firstName, String lastName, String filmName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.filmName = filmName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFilmName() {
    return filmName;
  }
}
