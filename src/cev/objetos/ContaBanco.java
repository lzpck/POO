package cev.objetos;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(int numConta, String dono) {
        this.numConta = numConta;
        this.dono = dono;
    }

    public void estadoAtual(){
        System.out.println("--------------------");
        System.out.println("Conta: " +
                this.getNumConta());
        System.out.println("Tipo: " +
                this.getTipo());
        System.out.println("Dono: " +
                this.getDono());
        System.out.println("Saldo atual: " +
                this.getSaldo());
        System.out.println("Status: " +
                this.getStatus());
    }

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC"){
            this.setSaldo(50);
        } else if (tipo == "CP"){
            this.setSaldo(150);
        }
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("A conta possui dinheiro!");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta possui débitos!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float valor){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado na conta de " +
                    this.getDono());
        } else {
            System.out.println("Impossível depositar!");
        }
    }

    public void sacar(float valor){
        if (this.getStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " +
                        this.getDono());
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível sacar de uma conta já fechada!");
        }
    }

    public void pagarMensal(){
        int mensalidade = 0;
        if (this.getTipo() == "CC"){
            mensalidade = 12;
        } else if (this.getTipo() == "CP"){
            mensalidade = 20 ;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - mensalidade);
            System.out.println("Mensalidade paga com sucesso por " +
                    this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta já fechada!");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
