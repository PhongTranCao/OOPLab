package hust.soict.ict;

import hust.soict.ict.aims.media.Media;

public class Disc extends Media {

    public Disc() {
    }

    public Disc(String s) {
        this.setTitle(s);
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    private int length;
    private String director;

    public Disc(int length, String director) {
        this.length = length;
        this.director = director;
    }
}
