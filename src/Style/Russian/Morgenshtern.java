package Style.Russian;

public class Morgenshtern extends RussianMusic {
    String school = "new school";
    String album = "someAlbum";
    public Morgenshtern(){
        singer = "MorgenSterhnAndKlavaKoka";
        songName ="Мне Пох";
        duration = "3:28";
        land = "Rashka";
        yearOfrelease = 2020;
        numberOfSingers =2;
    }
    public String toString() {
        return ("!!!" + singer + " " + songName + " " + duration + "s " + land + " " + numberOfSingers
                + " " + yearOfrelease + " " + style + " " + school);
    }
}
