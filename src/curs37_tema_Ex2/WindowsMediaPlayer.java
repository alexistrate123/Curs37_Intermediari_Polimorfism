package curs37_tema_Ex2;

public class WindowsMediaPlayer extends VideoPlayer {
    @Override
    public void playVideo(String movieName) {
        System.out.println("Playing video " + movieName + " at medium quality using WindowsMediaPlayer.");
    }
}
