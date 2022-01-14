package Style.Russian;

public class Leningrad extends RussianMusic{
    String school = "Modern";
    String album = "SPB";
    public Leningrad(){
        singer = "Leningrad";
        songName = "Raspizdyi";
        duration = "2:58";
        land ="Rashka";
        yearOfrelease = 2010;
        numberOfSingers = 18;
    }
    public String toString() {
        return ("!!!" + singer + " " + songName + " " + duration + "s " + land + " " + numberOfSingers
                + " " + yearOfrelease + " " + style + " " + school);
    }
}
