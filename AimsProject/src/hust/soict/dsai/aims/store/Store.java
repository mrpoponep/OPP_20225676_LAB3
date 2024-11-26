package AimsProject.src.hust.soict.dsai.aims.store;

import java.util.ArrayList;

import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore;

    public Store() {
        this.itemsInStore = new ArrayList<>();
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (dvd != null) {
            itemsInStore.add(dvd);
            System.out.println("The DVD \"" + dvd.getTitle() + "\" has been added to the store.");
        } else {
            System.out.println("Cannot add a null DVD to the store.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.contains(dvd)) {
            itemsInStore.remove(dvd);
            System.out.println("The DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
        } else {
            System.out.println("The DVD \"" + dvd.getTitle() + "\" is not found in the store.");
        }
    }

    public void displayStoreItems() {
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            System.out.println("Items in Store:");
            for (int i = 0; i < itemsInStore.size(); i++) {
                System.out.println((i + 1) + ". " + itemsInStore.get(i));
            }
        }
    }
}