import java.util.*;

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
}
