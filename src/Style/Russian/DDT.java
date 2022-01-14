package Style.Russian;

public class DDT extends RussianMusic {
    String school = "OldSchool";
    String album = "Актриса Весна";
    public DDT(){
        singer = "DDT";
        songName = "Что такое осень";
        duration = "3:11";
        numberOfSingers =7;
        yearOfrelease = 1992;
    }
    public String toString(){
        return ("!!!" + singer + " " + songName + " " + duration + "s " + land + " " + numberOfSingers
                + " " + yearOfrelease + " " + style + " " + school);
    }
}
