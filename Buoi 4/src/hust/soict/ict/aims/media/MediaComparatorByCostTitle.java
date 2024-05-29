package hust.soict.ict.aims.media;
import java.util.Comparator;
public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        int comparator = Float.compare(m2.getCost(), m1.getCost());
        if (comparator != 0) {
            return comparator;
        } else return m1.getTitle().compareTo(m2.getTitle());
    }
}