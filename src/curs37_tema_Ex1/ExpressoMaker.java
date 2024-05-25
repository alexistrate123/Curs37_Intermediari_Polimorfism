package curs37_tema_Ex1;

import java.util.Scanner;

public class ExpressoMaker extends CoffeMaker {
    public void prepareEspresso() {
        addCoffee();
        addMilk();
        makeItDouble();
        prepareCoffee();
    }
    public void addMilk() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Do you want milk in your espresso? (yes/no): ");
        String response = sc1.nextLine().toLowerCase();
        if (response.equals("yes")) {
            System.out.println("Adding milk for espresso");
        }
    }

    public void makeItDouble() {
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Do you want a double espresso? (yes/no): ");
        String response = sc2.nextLine().toLowerCase();
        if (response.equals("yes")) {
            addCoffee();
        }
    }


}
