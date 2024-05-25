package curs37_Exemplu1;

public class American extends Cetatean{
    public American(String nume) {
        super(nume);
    }

    @Override
    public void saluta() {
        System.out.println(this.nume + " says hello!");
    }
}
