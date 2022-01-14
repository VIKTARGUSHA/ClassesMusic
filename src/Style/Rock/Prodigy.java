package Style.Rock;

public class Prodigy extends RockStyle {
    String school = "OldSchool";
    String album = "SomeCrazyname";
    public Prodigy(){
        singer = "Prodigy";
        songName = "FireStarter";
        duration = "3:34";
        land = "England";
        yearOfrelease = 1996;
        numberOfSingers = 48;
    }
    public String toString(){
        return ("!!!" + singer + " " + songName + " " + duration + "s " + land + " " + numberOfSingers
                + " " + yearOfrelease + " " + style + " " + school);
    }
}
