package hust.soict.ict;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CompactDisc extends Disc implements Playable{
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
        tracks = (ArrayList<Track>) tracks.stream().filter(c ->!c.equals(track)).collect(Collectors.toList());

    }
    public void play(){
        System.out.println("Playing CD: "+ this.getTitle());
        System.out.println("CD length: " + this.getLength());
        System.out.println("....");
        for (Track track : tracks) {
            track.play();
            System.out.println(". . .");
        }
    }

    public void addTrack(Track track){
        if (!tracks.contains(track)){
            tracks.add(track);
        }
    }
    public void removeTrack(Track track){
        tracks.remove(track);
    }

    @Override
    public String toString() {
        return "title: " + this.getTitle() + " artist: " + this.getArtist() + " tracks: " + tracks;
    }
}