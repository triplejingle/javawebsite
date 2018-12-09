package DataAccesLayer.TMPmocks;

import Models.Artist;

import java.util.ArrayList;

public class TrackGenerator implements IGenerator<Artist> {
    public Artist one() {
        return null;
    }

    public ArrayList<Artist> numberOf(int number) {
        return null;
    }

    public String randomJson() {
     return "{\"track\": 5}";
    }
}
