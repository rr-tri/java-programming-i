
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public boolean equals(Object compared){
        // if the variables are located in the sam eposition, they are equal
        if (this == compared){
            return true;
        }
        
        // if the compare object is not of type Song, the objects are not equal
        if(!(compared instanceof Song)){
            return false;
        }
        // convert  the object into a object
        Song comparedSong = (Song) compared;
        
        return this.artist.equals(comparedSong.artist)
                && (this.durationInSeconds == comparedSong.durationInSeconds) 
                && this.name.equals(comparedSong.name);       
    }
   
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
