//Nicholas Drez
//892140140
//Lab 6
package Bookstore.Publications;
import Bookstore.Interfaces.Citable;

public class Music extends Publication implements Citable {
    private String artist;
    public Music(String t, String g, String a, String lT) {
        super(t, g);
        this.artist = a;
    }

    @Override
    public void MLACitation() {
        System.out.println(artist + ". " + title + ". " + genre + ".");
    }
}
