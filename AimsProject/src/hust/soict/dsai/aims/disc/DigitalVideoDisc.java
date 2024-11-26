package AimsProject.src.hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private double cost;
    private String director;
    private int length;
    private int id;

    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title) {
        this.title = title;

        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String category, String title, double cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;

        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String director, String category, String title, double cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;

        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;

        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public String toString() {
        return "DVD - " 
            + (title != null ? title : "Unknown Title") + " - " 
            + (category != null ? category : "Unknown Category") + " - " 
            + (director != null ? director : "Unknown Director") + " - " 
            + (length > 0 ? length + " mins" : "Unknown Length") + ": " 
            + cost + " $";
    }

    public boolean isMatch(String title) {
        return this.title != null && this.title.equalsIgnoreCase(title);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public double getCost() {
        return cost;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public int getId() {
        return id;
    }
}
