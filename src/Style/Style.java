package Style;
import java.util.*;

public class Style {
   protected String singer, land, duration, songName;
   protected int numberOfSingers, yearOfrelease;

   private String musicName = "myMusic";

    public String getSinger(){
        return singer;
    }

    public String getLand(){
        return land;
    }

    public int getYearOfrelease(){
        return yearOfrelease;
    }

    public String getDuration(){
        return duration;
    }

    public int getNumberOfSingers(){
        return numberOfSingers;
    }

    public String getMusicName() {return musicName;}

    public  String getSongName(){ return songName;}

    public String toString(){
       return ("--@@@@@---" + singer + " " + songName + " " + land + " " + duration + " " + numberOfSingers );
    }

}
