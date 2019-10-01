package ch.tbz.modul226.modul226a.musicplayer;

/*
 * This is the class Music. It has the url of the music folder and the name of the music.
 * @author suhejl
 * @version 1.0
 * */
public class Music {
  private String name;
  private String url;

  public Music(String name, String url) {
    this.name = name;
    this.url = url;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
