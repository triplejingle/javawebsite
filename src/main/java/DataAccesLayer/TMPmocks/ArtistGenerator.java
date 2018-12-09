package DataAccesLayer.TMPmocks;

import Models.Artist;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
public class ArtistGenerator implements IGenerator<Artist> {
    public Artist one() {
        return oneArtist("Erik", "Evers");
    }

    public ArrayList<Artist> numberOf(int number){
        ArrayList<Artist> artistArrayList = new ArrayList<Artist>();
        if(number<3){
            artistArrayList.add(oneArtist("Erik","Evers"));
            artistArrayList.add(oneArtist("Jesse","Lesnussa"));
            artistArrayList.add(oneArtist("Vincent","van Gogh"));
        }else{
            for(int i = 0 ;i< number ;i++){
                artistArrayList.add(oneArtist("Erik"+i,"Evers"));
                artistArrayList.add(oneArtist("Jesse"+i,"Lesnussa"));
                artistArrayList.add(oneArtist("Vincent"+i,"van Gogh"));
            }
        }
        return artistArrayList;
    }

    public String randomJson(){
        return "{\"json\": 5}";
    }
    private Artist oneArtist(String firstname,String lastname){
        Artist artist = new Artist();
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        artist.setDateOfBirth(date);
        artist.setFirstname(firstname);
        artist.setLastname(lastname);
        return artist;
    }
}
