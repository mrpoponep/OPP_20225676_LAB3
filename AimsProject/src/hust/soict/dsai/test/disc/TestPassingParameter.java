package AimsProject.src.hust.soict.dsai.test.disc;
import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

class DigitalVideoDiscWrapper {
    DigitalVideoDisc dvd;

    public DigitalVideoDiscWrapper(DigitalVideoDisc dvd) {
        this.dvd = dvd;
    }

    public DigitalVideoDisc getDvd() {
        return dvd;
    }

    public void setDvd(DigitalVideoDisc dvd) {
        this.dvd = dvd;
    }
}

public class TestPassingParameter {

    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        System.out.println("Before swap:");
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());

        DigitalVideoDiscWrapper wrapper1 = new DigitalVideoDiscWrapper(jungleDVD);
        DigitalVideoDiscWrapper wrapper2 = new DigitalVideoDiscWrapper(cinderellaDVD);

        swap(wrapper1, wrapper2);

        System.out.println("After swap:");
        System.out.println("Jungle DVD title: " + wrapper1.getDvd().getTitle());
        System.out.println("Cinderella DVD title: " + wrapper2.getDvd().getTitle());
    }

    public static void swap(DigitalVideoDiscWrapper wrapper1, DigitalVideoDiscWrapper wrapper2) {
        DigitalVideoDisc temp = wrapper1.getDvd();
        wrapper1.setDvd(wrapper2.getDvd());
        wrapper2.setDvd(temp);
    }
}