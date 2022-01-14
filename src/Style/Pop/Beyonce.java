package Style.Pop;

public class Beyonce extends PopMusic{
    String school = "AmericanModernSchool";
    String album = "BDay";
    public Beyonce (){
        singer = "Beyonce";
        land = "USA";
        duration = "3:48";
        songName = "Hello";
        numberOfSingers = 1;
        yearOfrelease = 2005;
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
