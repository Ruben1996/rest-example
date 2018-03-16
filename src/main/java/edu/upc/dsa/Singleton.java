package edu.upc.dsa;
import java.util.List;

public class Singleton {


    private static Singleton instance;
    private Singleton() {
        // Exists only to defeat instantiation.
    }
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private List<Track> tracks;
    public List<Track> getTrack(){
        return tracks;
    }

    
}