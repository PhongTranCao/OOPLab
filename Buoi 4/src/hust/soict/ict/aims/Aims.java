package hust.soict.ict.aims;

import hust.soict.ict.Cart;
import hust.soict.ict.DigitalVideoDisc;
import hust.soict.ict.aims.media.Media;

import java.util.*;

public class Aims {
    public static Cart anOrder = new Cart();

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("---------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("---------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
        Scanner scanner = new Scanner(System.in);
        short s = scanner.nextShort();
        switch (s) {
            case 0:
                System.out.println("Exiting");
            case 1:
                storeMenu();
                break;
            case 2:
                updateStore();
                break;
            case 3:
                cartMenu();
                break;
            default:
                break;
        }
        scanner.close();
    }


    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("---------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("---------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
        Scanner scanner = new Scanner(System.in);
        short s = scanner.nextShort();
        switch (s) {
            case 0:
                showMenu();
                break;
            case 1:
                mediaDetailsMenu();
                break;
            case 2:
                addToCart();
                break;

            case 3:
                playMedia();
                break;
            case 4:
                anOrder.print();
                break;
            default:
                break;
        }
        scanner.close();
    }


    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("---------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("---------------------------");
        System.out.println("Please choose a number: 0-1-2");
        Scanner scanner = new Scanner(System.in);
        short s = scanner.nextShort();
        switch (s) {
            case 0:
                showMenu();
                break;
            case 1:
                addToCart();
                break;
            case 2:
                playMedia();
                break;
            default:
                break;
        }
        scanner.close();
    }


    public static void addToCart() {
        System.out.println("Enter the title you want to add: ");
        Scanner scanner = new Scanner(System.in);
        DigitalVideoDisc dvd = new DigitalVideoDisc(scanner.nextLine());
        anOrder.addMedia(dvd);
        System.out.println("Current number of DVDs: " + anOrder.getItemsOrdered());
        scanner.close();
    }

    public static void removeFromCart() {
        System.out.println("Enter the title you want to remove: ");
        Scanner scanner = new Scanner(System.in);
        DigitalVideoDisc dvd = new DigitalVideoDisc(scanner.nextLine());
        anOrder.removeMedia(dvd);
        System.out.println("Current number of DVDs: " + anOrder.getItemsOrdered());
        scanner.close();
    }

    public static void playMedia() {
        System.out.println("Enter the title you want to play: ");
        Scanner scanner = new Scanner(System.in);
        DigitalVideoDisc dvd = new DigitalVideoDisc(scanner.nextLine());
        dvd.play();
        scanner.close();
    }


    public static void updateStore() {
        System.out.println("Options: ");
        System.out.println("---------------------------");
        System.out.println("1. Add media to store");
        System.out.println("2. Remove media to store");
        System.out.println("0. Back");
        System.out.println("---------------------------");
        Scanner scanner = new Scanner(System.in);
        short s = scanner.nextShort();
        switch (s) {
            case 0:
                showMenu();
                break;
            case 1:
                addToCart();
                break;
            case 2:
                playMedia();
                break;
            default:
                break;
        }
        scanner.close();
    }

    /*public static void removeMediaFromStore() {
        System.out.println("Enter the title: ");
        Scanner scanner = new Scanner(System.in);
        hust.soict.ict.Disc disc = new hust.soict.ict.Disc(scanner.nextLine());
        anOrder.removeMedia(disc);
        scanner.close();
    }*/


    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("---------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("---------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
        Scanner scanner = new Scanner(System.in);
        short s = scanner.nextShort();
        switch (s) {
            case 0:
                showMenu();
                break;
            case 1:
                filterMediaInCart();
                break;
            case 2:
                sortMediaInCart();
                break;
            case 3:
                removeFromCart();
            case 4:
                playMedia();
            case 5:
                placeOrder();
            default:
                break;
        }
        scanner.close();
    }


    public static void filterMediaInCart() {
        System.out.println("Options: ");
        System.out.println("---------------------------");
        System.out.println("1. Filter by id");
        System.out.println("2. Filter by title");
        System.out.println("0. Back");
        System.out.println("---------------------------");
        System.out.println("Choose a number: 0-1-2");
        Scanner scanner = new Scanner(System.in);
        short s = scanner.nextShort();
        switch (s) {
            case 0:
                showMenu();
                break;
            case 1:
                filterByTitle();
                break;
            case 2:
                filterById();
                break;
            default:
                break;
        }
        scanner.close();
    }


    public static void filterByTitle() {
        System.out.println("Enter the title to filter: ");
        Scanner scanner = new Scanner(System.in);
        String res = scanner.nextLine();
        anOrder.searchByTitle(res);
        scanner.close();
    }

    public static void filterById() {
        System.out.println("Enter the ID to filter: ");
        Scanner scanner = new Scanner(System.in);
        int res = scanner.nextInt();
        anOrder.searchByID(res);
        scanner.close();
    }


    public static void sortMediaInCart() {
        System.out.println("Options: ");
        System.out.println("---------------------------");
        System.out.println("1. Sort by id");
        System.out.println("2. Sort by title");
        System.out.println("0. Back");
        System.out.println("---------------------------");
        System.out.println("Choose a number: 0-1-2");
        Scanner scanner = new Scanner(System.in);
        short s = scanner.nextShort();
        switch (s) {
            case 0:
                showMenu();
                break;
            case 1:
                sortByTitle();
                break;
            case 2:
                sortByCost();
                break;
            default:
                break;
        }
        scanner.close();
    }


    public static void sortByTitle() {
        anOrder.getItemsOrdered().sort(Comparator.comparing(Media::getTitle));
        System.out.println("List sorted by title: " + anOrder.getItemsOrdered());
    }

    public static void sortByCost() {
        anOrder.getItemsOrdered().sort((m1, m2) -> Float.compare(m1.getCost(), m2.getCost()));
        System.out.println("hust.soict.ict.Cart sorted by title: "+ anOrder.getItemsOrdered());
    }

    public static void placeOrder() {
        anOrder.print();
        System.out.println("Order created");
    }
    public static void main(String[] args) {
    showMenu();
    }
}
