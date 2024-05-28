import java.util.ArrayList;

public class CompactDisc extends Disc{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    public CompactDisc(int length, String director, String artist, ArrayList<Track> tracks) {
        super(length, director);
        this.artist = artist;
        this.tracks = tracks;
    }
    public boolean addAuthor (Track track){
        if (!tracks.contains(track)){
            tracks.add(track);
            return true;
        }
        return false;
    }
    public void removeAuthor (Track track){
        tracks = tracks.stream().filter(c ->!c.equals(track)).collect(Collectors.toList());

    }
    public void play(){
        System.out.println("Playing CD: "+this.getTitle()); System.out.println("CD length: "+this.getLength()); System.out.println("....
        for (Track track : tracks) {
            System.out.println(".
                            .");
                            .");
                    track.play();
        }
    }
    public String toString(){
        return id + ". CD - "+this.getTitle() +
                +this.getCategory() +
                +this.getDirector() +
                +this.getLength() +
: "+this.getCost() + "$" + tracks.stream().map(Track::toString).reduce("",(i,j)->i+"\n"+j);
    }
    public void addTrack (Track track){
        if (!tracks.contains(track)){
            tracks.add(track);
        }
    }
    public void removeTrack (Track track){
        tracks.remove(track);
    }
}
}