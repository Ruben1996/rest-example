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

    List<Track> tracks;
    public Track getTrack(){
        return tracks;
    }
}