package AimsProject.src.hust.soict.dsai.aims;
import AimsProject.src.hust.soict.dsai.aims.cart.Cart;
import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Action", "Movie 1", 15.99);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Comedy", "Movie 2", 12.99);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Comedy", "Movie 3", 1.11);

        DigitalVideoDisc[] dvds = {dvd1, dvd2, dvd3};

        cart.addDigitalVideoDisc(dvds);

        System.out.println("");

        cart.removeDigitalVideoDisc(dvd1);
        System.out.println("Total cost after removing dvd1: " + cart.totalCost());
        cart.printCart();

        cart.searchDVD("Movie 2");
        cart.searchDVD(3);
    }
}
