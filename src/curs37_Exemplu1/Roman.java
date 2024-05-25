package curs37_Exemplu1;

public class Roman extends Cetatean {
    public Roman(String nume) {
        super(nume);
    }

    @Override
    public void saluta() {
        System.out.println(this.nume + " a zis buna ziua!");
    }
}
