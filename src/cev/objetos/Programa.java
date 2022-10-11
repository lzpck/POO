package cev.objetos;

public class Programa {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco(0001, "Leandro");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco(0002, "Jubileu");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);

        p1.sacar(150);
        p2.sacar(100);

        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
