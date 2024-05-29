package hust.soict.ict.aims.media;
import java.util.Comparator;
public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        int comparator = m1.getTitle().compareTo(m2.getTitle());
        if (comparator != 0) {
            return comparator;
        } else return Float.compare(m2.getCost(), m1.getCost());
    }
}
