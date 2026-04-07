//Nicholas Drez
//892140140
//Lab 6
package Bookstore;

import java.util.ArrayList;
import Bookstore.Publications.Publication;
import Bookstore.Interfaces.Citable;

public class Inventory {
    private ArrayList<Publication> publications = new ArrayList<>();

    public void addPublication(Publication p) {
        publications.add(p);
    }

    public void listInventory() {
        for (Publication p : publications) {
            p.printInfo();
        }
    }

    public void printBibliography() {
        System.out.println("BIBLIOGRAPHY");
        for (Publication pub : publications) {
            // TODO: Part 3 - Check if the item is Citable
            if (pub instanceof Citable) {
                ((Citable) pub).MLACitation();
            }
        }
    }
}
