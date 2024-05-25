package curs37_tema_Ex1;

public class Main {
    /*
1. Creati clasa CoffeMaker, cu metoda prepareCoffe() si addCoffe(). Metoda addCoffe() va fi apelata in metoda prepareCoffe().
2. Clasa CappucinoMaker  va mosteni clasa CoffeMaker, va avea metoda addMilk() si metoda . Cand preparam cappucino se va
   adauga  cafea ,  se va adauga lapte, iar apoi se va adauga zahar.
3. Clasa ExpressoMaker, va mosteni clasa CoffeMaker care va avea metoda addMilk() care va intreba utilizatorul daca doreste
   lapte  la expresso, si metoda makeItDouble() , care de asemenea va intreba utilizatorul daca doreste un expresso dublu.
4. Cand preparam un expresso , vom adauga cafea, vom intreba utilizatorul daca doreste cafea dubla, iar daca da , vom
   adauga din nou cafea .
5. Preparati un Cappucino si un Expresso.

De refacut ! de la 0
    */


    public static void main(String[] args) {

      // CappucinoMaker cappucinoMaker = new CappucinoMaker();
      // cappucinoMaker.prepareCappuccino();

       ExpressoMaker expressoMaker = new ExpressoMaker();
       expressoMaker.prepareEspresso();

    }
}
