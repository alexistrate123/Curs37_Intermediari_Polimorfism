package curs37_Exemplu2;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    // Overload !
    /*
    1. Creati clasa Car si alte doua clase copii : ConvertibleCar si MiniVan;
    2. Declara doua metode in clasa de baza (Car) si metodele sunt: describeCar() si showDetails() care sa afiseze la consola
    un text cu detalii comune (void);
    3. Apeleaza metoda showDetails() in metoda describeCar();
    4. Implementeaza in clasa ConvertibleCar metoda showDetails() prin ascunderea din clasa de baza si definirea alteia noua. (suprascriem metoda)
    5. Implementeaza in clasa MiniVan metoda showDetails() prin extinderea din clasa de baza si modificarea textului afisat la consola;
    6. Scrie o metoda statica test1() in clasa Progam. In aceasta declara 3 obiecte, cate unul de tipul fiecarei clase
    si apeleaza metoda describeCar() cu fiecare obiect. Apeleaza metoda test1() in Main si observa diferentele.
    7. Scrie o metoda statica test2() in clasa Program. In aceasta declasa o lista Cars de tip Car care sa contina 3
    obiecte noi de tipul fiecarei clase. Apeleaza metoda describeCar() prin fiecare obiect din lista folosind un (LOOP).
    Apeleaza metoda test2() si observa diferentele.
    8. Scrie o metoda test3() in clasa Program. Declara un obiect de tip ConvertibleCar si unul de tip MiniVan. Apeleaza
    metoda showDetails() prin fiecare obiect , apeleaza metoda test3() si observa diferentele.
    9. Scrie o metoda test4() in clasa Program, declara un obiect de tip ConvertibleCar si salveazal intr-o variabila de tip Car
    si altul de tip MiniVan si salveaza tot intr-o variabila de tip Car. Apeleaza metoda showDetails() prin fiecare,
    apeleaza metoda test4() si observa diferentele.
     */

    public static void main(String[] args) {
      // test1();
      // test2();

       // test3();
        test4();
    }

    public static void test1() {
        ConvertibleCar convertibleCar = new ConvertibleCar();
        MiniVan miniVan = new MiniVan();
        Car car = new Car();

        convertibleCar.describeCar();
        System.out.println();

        miniVan.describeCar();
        System.out.println();

        car.describeCar();
    }

    public static void test2() {
        ConvertibleCar convertibleCar = new ConvertibleCar();
        MiniVan miniVan = new MiniVan();
        Car car = new Car();
        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(convertibleCar, miniVan, car));
        for (Car car1 : cars ) {
            car1.describeCar();
        }
    }

    public static void test3() {
        ConvertibleCar convertibleCar = new ConvertibleCar();
        MiniVan miniVan = new MiniVan();

        convertibleCar.showDetails();
        System.out.println();

        miniVan.showDetails();

    }

    public static void test4() {
        Car miniVan = new MiniVan();
        Car convertibleCar = new ConvertibleCar();

        miniVan.showDetails();
        System.out.println();

        convertibleCar.showDetails();
    }

}
