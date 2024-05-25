package curs37_Exemplu1;

public class Italian extends Cetatean {
    public Italian(String nume) {
        super(nume);
    }

    @Override
    public void saluta() {
        System.out.println(this.nume + " Bonjorno!");
    }
}
