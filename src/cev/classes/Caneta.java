package cev.classes;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    public Caneta() {
    }

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada) {
            System.out.println("ERRO! Não posso rasbicar.");
        } else {
            System.out.println("Estou rabiscando!");
        }

    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
