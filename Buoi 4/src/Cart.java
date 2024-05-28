import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    List<DigitalVideoDisc> itemOrdered = new ArrayList<DigitalVideoDisc>();
    int quantityOrdered;
    void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (quantityOrdered == 20) System.out.println("Cart is full!");
        else{
            quantityOrdered++;
            itemOrdered.add(disc);
            System.out.println("Disc is added");
            if (quantityOrdered == 19) System.out.println("Cart is almost full!");
            if (quantityOrdered == 20) System.out.println("Cart is full!");
        }
    }
    void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){

    }

    void totalCost()
    {
        float sum = 0.00f;
        for (int i = 0; i < quantityOrdered; i++) {
            sum += itemOrdered.get(i).getCost();
        }
        System.out.printf("The total cost is: %.2f%n", sum);
    }
    void removeDigitalVideoDisc(DigitalVideoDisc disc)
    {
        itemOrdered.remove(disc);
        quantityOrdered--;
    }
    void print(){
        System.out.println("***********************CART***********************");
        for (DigitalVideoDisc disc : itemOrdered)
            System.out.println(
                    "DVD - " + disc.getTitle() + " - "
                    + disc.getCategory() + " - "
                    + disc.getDirector() + " - "
                    + disc.getLength() + " : "
                    + disc.getCost()
            );
        totalCost();
        System.out.println("***************************************************");
    }
    void searchByID (int id){
        System.out.println("Searching for " + id + ":");
        if (id > quantityOrdered || id < 1) System.out.println("Invalid ID");
        else {
            DigitalVideoDisc disc = itemOrdered.get(id);
            System.out.println(
                    "DVD - " + disc.getTitle() + " - "
                            + disc.getCategory() + " - "
                            + disc.getDirector() + " - "
                            + disc.getLength() + " : "
                            + disc.getCost()
            );
        }
    }
    void searchByTitle (String title){
        System.out.println("Searching for " + title + ":");
        for (DigitalVideoDisc disc : itemOrdered){
            if (disc.getTitle().toLowerCase().equals(title)){
                System.out.println(
                        "DVD - " + disc.getTitle() + " - "
                                + disc.getCategory() + " - "
                                + disc.getDirector() + " - "
                                + disc.getLength() + " : "
                                + disc.getCost()
                );
                break;
            }
            if (disc == itemOrdered.getLast()) System.out.println("Invalid Title");
        }
    }
}
