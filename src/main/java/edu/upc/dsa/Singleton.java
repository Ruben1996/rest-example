package edu.upc.dsa;
import java.util.*;

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

    public List<Track> tracks = new ArrayList<Track>();

    public List<Track> getTrack(){
        return tracks;
    }


}