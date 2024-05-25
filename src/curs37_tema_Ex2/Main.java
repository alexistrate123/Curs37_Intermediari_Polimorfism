package curs37_tema_Ex2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    /*
1. Creati clasa VideoPlayer, cu metoda playVideo(String movieName);
2. Clasa VLCPlayer va porni videoul la o calitate buna.
3. Clasa WindowsMediaPlayer va  porni videoul la o calitate medie.
4. Clasa Winmap va porni videoul  la o calitate slaba.
5. Creati un VideoPlayer de fiecare tip  de date definit.
6. Adaugati 5 filme intr-o lista si faceti toate programele sa ruleze filmele respective, descrescator.

     */

    public static void main(String[] args) {

        ArrayList<String> movieList = new ArrayList<>();
        movieList.add("Movie1");
        movieList.add("Movie2");
        movieList.add("Movie3");
        movieList.add("Movie4");
        movieList.add("Movie5");

        Collections.reverse(movieList);


        VLCPlayer vlcPlayer = new VLCPlayer();
        WindowsMediaPlayer windowsMediaPlayer = new WindowsMediaPlayer();
        Winmap winmap = new Winmap();

        for (String movie : movieList) {
            vlcPlayer.playVideo(movie);
            windowsMediaPlayer.playVideo(movie);
            winmap.playVideo(movie);
        }

    }
}
