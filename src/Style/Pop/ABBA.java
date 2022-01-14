package Style.Pop;

public class ABBA extends PopMusic {
    String school = "OldSchool";
    String album = "SomeKindOfAlbum";
   public ABBA (){
        singer = "ABBA";
        land = "Sweden";
        duration = "2:59";
        songName = "Mamma Mia";
        numberOfSingers = 4;
        yearOfrelease = 1975;
    }
    public String toString(){
        return ("!!!" + singer + " " + songName + " " + duration + "s " + land + " " + numberOfSingers
                + " " + yearOfrelease + " " + style + " " + school);
    }
    public void setSchool(String school){
        school = school;
    }
    public String getAlbum(){
        return album;
    }
}
