package cev.classes;

public class Principal {
    public Principal() {
    }

    public static void main(String[] args) {
        Caneta bic = new Caneta();
        bic.cor = "Azul";
        bic.ponta = 0.5F;
        bic.destampar();
        bic.status();
        bic.rabiscar();
        Caneta fabercastell = new Caneta();
        fabercastell.modelo = "Faber Castell";
        fabercastell.cor = "Vermelha";
        fabercastell.destampar();
        fabercastell.status();
        fabercastell.rabiscar();
    }
}
