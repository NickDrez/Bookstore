//Nicholas Drez
//892140140
//Lab 6
package Bookstore.Publications;

public class Publication {
    protected String title;
    protected String genre;

    public Publication(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public void printInfo() {
        System.out.println("Title: " + title + ", Genre: " + genre);
    }
}
