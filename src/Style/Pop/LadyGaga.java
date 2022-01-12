package Style.Pop;

public class LadyGaga extends PopMusic {
    String album = "new album";
    String school = "newSchool";
    public LadyGaga() {
        this.singer = "LadyGaga";
        this.land = "USA";
        yearOfrelease = 2013;
        duration = "3:11";
        numberOfSingers = 1;
        songName = "Alekhandro";
    }
    public String getAlbumName(){
        return album;
    }
    public String toString(){
        return ("!!!" + singer + " " + songName + " " + duration + "s " + land + " " + numberOfSingers
                + " " + yearOfrelease + " " + style + " " + school);
    }
}
