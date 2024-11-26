package AimsProject.src.hust.soict.dsai.aims.cart;
import java.util.ArrayList;

import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Cart {
    private DigitalVideoDisc[] items = new DigitalVideoDisc[20]; 
    private int qtyOrdered = 0; 

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < 20) {
            items[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc \"" + disc.getTitle() + "\" - \"" + disc.getId()  + "\" has been added.");
        } else {
            System.out.println("The cart is almost full. Cannot add more DVDs.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] discArray) {
        for (DigitalVideoDisc disc : discArray) {
            if (qtyOrdered < 20) {
                items[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
            } else {
                System.out.println("The cart is full. Cannot add \"" + disc.getTitle() + "\".");
                break;
            }
        }
    }
    

    public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if (qtyOrdered < 19) {
            items[qtyOrdered] = disc1;
            qtyOrdered++;
            items[qtyOrdered] = disc2;
            qtyOrdered++;
            System.out.println("The disc \"" + disc1.getTitle() + "\" has been added.");
            System.out.println("The disc \"" + disc2.getTitle() + "\" has been added.");
        } else {
            System.out.println("The cart is almost full. Cannot add more DVDs.");
        }
    }
    

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (items[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed.");
                return;
            }
        }
        System.out.println("The disc \"" + disc.getTitle() + "\" was not found in the cart.");
    }

    public void searchDVD(int id) {
        ArrayList<DigitalVideoDisc> matchingDVDs = new ArrayList<>();
        for (int i = 0; i < qtyOrdered; i++) {
            if (items[i].getId() == id) {
                matchingDVDs.add(items[i]);
            }
        }
        if (matchingDVDs.isEmpty()) {
            System.out.println("No DVDs found with title: \"" + id + "\"");
        } else {
            System.out.println("Matching DVDs:");
            for (DigitalVideoDisc dvd : matchingDVDs) {
                System.out.println(dvd);
            }
        }
    }

    public void searchDVD(String title) {
        ArrayList<DigitalVideoDisc> matchingDVDs = new ArrayList<>();
        for (int i = 0; i < qtyOrdered; i++) {
            if (items[i].isMatch(title)) {
                matchingDVDs.add(items[i]);
            }
        }
        if (matchingDVDs.isEmpty()) {
            System.out.println("No DVDs found with title: \"" + title + "\"");
        } else {
            System.out.println("Matching DVDs:");
            for (DigitalVideoDisc dvd : matchingDVDs) {
                System.out.println(dvd);
            }
        }
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");

        double totalCost = 0.0;
        int index = 1;

        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(index + ". " + items[i].toString());
            totalCost += items[i].getCost();
            index++;
        }

        System.out.println("\nTotal cost: " + totalCost + " $");
        System.out.println("***************************************************");
    }

    public double totalCost() {
        double total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += items[i].getCost();
        }
        return total;
    }
}
