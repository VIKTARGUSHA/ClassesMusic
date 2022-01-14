package Style.Rock;

public class Metallica extends RockStyle {
    String school = "OldSchool";
    String album = "SomeKindOfAlbum";
    public Metallica(){
        singer = "Metallica";
        songName = "Mama said";
        land = "USA";
        duration = "5:38";
        numberOfSingers = 5;
        yearOfrelease = 1995;
    }
    public String toString(){
        return ("!!!" + singer + " " + songName + " " + duration + "s " + land + " " + numberOfSingers
                + " " + yearOfrelease + " " + style + " " + school);
    }
}
