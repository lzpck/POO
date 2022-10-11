package cev.metodos;

public class Principal {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", 0.4f, "Azul");
        Caneta c2 = new Caneta("Faber Castell", 0.7f, "Vermelha");
        c1.status();
        c2.status();
    }
}
