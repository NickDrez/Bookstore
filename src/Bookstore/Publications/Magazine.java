//Nicholas Drez
//892140140
//Lab 6
package Bookstore.Publications;
import Bookstore.Interfaces.Citable;

public class Magazine extends Publication implements Citable {
    private int issue;
    private int volume;
    private String publisher;

    public Magazine(String t, String g, int i, int v, String p) {
        super(t, g);
        this.issue = i;
        this.volume = v;
        this.publisher = p;
    }

    @Override
    public void MLACitation() {
        System.out.println(title + ". Volume " + volume + " Issue " + issue + ", " + publisher + ".");
    }
}
