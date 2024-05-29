package hust.soict.ict;

import hust.soict.ict.aims.media.Media;

import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private final ArrayList<Media> itemOrdered = new ArrayList<Media>();

    public void addMedia(Media media){
        itemOrdered.add(media);
        System.out.println("hust.soict.ict.Disc is added");
    }

    void totalCost()
    {
        float sum = 0.00f;
        for (Media item : itemOrdered) {
            sum += item.getCost();
        }
        System.out.printf("The total cost is: %.2f%n", sum);
    }

    public void removeMedia(Media disc)
    {
        itemOrdered.remove(disc);
    }

    public void print(){
        System.out.println("***********************CART***********************");
        for (Media disc : itemOrdered)
            System.out.println(
                    "DVD - " + disc.getTitle() + " - "
                    + disc.getCategory() + " - "
                    + disc.getCost()
            );
        totalCost();
        System.out.println("***************************************************");
    }

    public void searchByID(int id){
        System.out.println("Searching for " + id + ":");
        if (id < 1) System.out.println("Invalid ID");
        else {
            Media disc = itemOrdered.get(id);
            System.out.println(
                    "DVD - " + disc.getTitle() + " - "
                            + disc.getCategory() + " - "
                            + disc.getCost()
            );
        }
    }

    public void searchByTitle(String title){
        System.out.println("Searching for " + title + ":");
        for (Media disc : itemOrdered){
            if (disc.getTitle().toLowerCase().equals(title)){
                System.out.println(
                        "DVD - " + disc.getTitle() + " - "
                                + disc.getCategory() + " - "
                                + disc.getCost()
                );
                break;
            }
            if (disc == itemOrdered.getLast()) System.out.println("Invalid Title");
        }
    }

    public ArrayList<Media> getItemsOrdered(){
        return itemOrdered;
    }

}
