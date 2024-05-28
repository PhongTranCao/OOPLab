public class Disc extends Media {
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
