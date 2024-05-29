package hust.soict.ict;

import hust.soict.ict.aims.media.Media;

import java.util.ArrayList;

public class Store extends Media {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private final ArrayList<Media> itemOrdered = new ArrayList<Media>();

    void addMedia(Media media){
        itemOrdered.add(media);
        System.out.println("hust.soict.ict.Disc is added");
    }

    void removeMedia(Media disc)
    {
        itemOrdered.remove(disc);
    }
}
