package curs37_tema_Ex2;

public class VLCPlayer extends VideoPlayer {
    @Override
    public void playVideo(String movieName) {
        System.out.println("Playing video " + movieName + " at high quality using VLCPlayer.");
    }

}
