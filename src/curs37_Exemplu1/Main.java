package curs37_Exemplu1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    // OVERERIDE ! (Suprascriem metoda din clasa parinte [Cetatean]);
    public static void main(String[] args) {

        ArrayList<Cetatean> cetatetni = new ArrayList<>(Arrays.asList(
                new American("Johnathan"),
                new Italian("Castaveli"),
                new Roman("Gigel Frone")));

        for (Cetatean cetatean1 : cetatetni) {
            cetatean1.saluta();
        }


    }

}
