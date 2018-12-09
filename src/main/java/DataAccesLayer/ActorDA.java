package DataAccesLayer;

import DataAccesLayer.TMPmocks.ArtistGenerator;
import Models.Artist;


import java.util.ArrayList;

public class ActorDA implements IDAL<Artist>{

    ArtistGenerator artistGenerator ;

    public ActorDA(){
        artistGenerator = new ArtistGenerator();
    }
    public Artist getSingle(String criteria) {
        return artistGenerator.one();
    }

    public ArrayList<Artist> getList(String criteria) {
        return artistGenerator.numberOf(2);
    }

    public void create(ArrayList<String> list) {

    }

    public void delete(String criteria) {

    }

    public void update(String to, String where) {

    }
}
