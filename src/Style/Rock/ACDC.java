package Style.Rock;

public class ACDC extends RockStyle{
    String school = "TooOldSchool";
    String album = "SomeOldAlbum";
    public ACDC(){
        singer = "ACDC";
        songName = "Highway to hell";
        land = "USA";
        duration = "6:38";
        numberOfSingers = 3;
        yearOfrelease = 1979;
    }
    public String toString(){
        return ("!!!" + singer + " " + songName + " " + duration + "s " + land + " " + numberOfSingers
                + " " + yearOfrelease + " " + style + " " + school);
    }
}
