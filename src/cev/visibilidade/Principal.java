package cev.visibilidade;

public class Principal {
    public Principal() {
    }

    public static void main(String[] args) {
        Caneta C1 = new Caneta();
        C1.modelo = "BIC";
        C1.cor = "Azul";
//        C1.ponta = 0.5f;
        C1.carga = 80;
//        C1.tampada = true;
        C1.tampar();
        C1.status();
        C1.rabiscar();
    }
}
