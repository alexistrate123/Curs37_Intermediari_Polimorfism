package curs37_tema_Ex1;

public class CoffeMaker {
    int coffee;

    public CoffeMaker() {
        coffee = 0;
    }

    public void addCoffee() {
        System.out.println("Adding coffe.");
        coffee++;
    }

    public void prepareCoffee() {
        System.out.println("Preparing coffee...");
        for (int i = 0; i < coffee; i++) {
            System.out.println("Adding coffee");
        }
        System.out.println("Coffee is ready!");
    }
}
