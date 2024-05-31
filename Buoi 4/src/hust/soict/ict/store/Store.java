package hust.soict.ict.store;

import hust.soict.ict.aims.media.Media;

import java.util.ArrayList;

public class Store extends Media {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private final ArrayList<Media> itemOrdered = new ArrayList<Media>();

    public void addMedia(Media media){
        itemOrdered.add(media);
        System.out.println("Disc is added");
    }

    public void removeMedia(Media disc)
    {
        itemOrdered.remove(disc);
    }

    public ArrayList<Media> getItemOrdered(){
        return itemOrdered;
    }
}
