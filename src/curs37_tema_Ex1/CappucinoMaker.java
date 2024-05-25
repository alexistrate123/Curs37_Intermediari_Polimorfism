package curs37_tema_Ex1;

public class CappucinoMaker extends CoffeMaker {
    public void addMilk() {
        System.out.println("Adding milk for cappuccino");
    }

    public void addSugar() {
        System.out.println("Adding sugar for cappuccino");
    }

    public void prepareCappuccino() {
        addCoffee();
        addMilk();
        addSugar();
        prepareCoffee();
    }
}
