package AimsProject.src.hust.soict.dsai.test.cart;
import AimsProject.src.hust.soict.dsai.aims.cart.Cart;
import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
    
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Jungle Book");
    
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);
    
        System.out.println("\nSearch by ID:");
        cart.searchDVD(2);
    
        System.out.println("\nSearch by Title:");
        cart.searchDVD("Jungle");
    }
    
}
