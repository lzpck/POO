package cev.objetos;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);
        if (tipo == "CC"){
            setSaldo(50);
        } if (tipo == "CP"){
            setSaldo(150);
        }
    }

    public void fecharConta(){
        if (saldo > 0){
            System.out.println("A conta possui dinheiro!");
        }
        if (saldo < 0){
            System.out.println("Conta possui débitos!");
        }
        if (saldo == 0){
            setStatus(false);
        }
    }

    public void depositar(int valor){
        if (status == true){
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Impossível depositar!");
        }
    }

    public void sacar(int valor){
        if (status == true && saldo > valor){
         setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente ou conta está inativa!");
        }
    }

    public void pagarMensal(){
        int mensalidade = 0;
        if (tipo == "CC"){
            mensalidade = 12;
        }
        if (tipo == "CP"){
            mensalidade = 20 ;
        }
        if (status == true && saldo > mensalidade){
            setSaldo(getSaldo() - mensalidade);
        } else {
            System.out.println("Impossível pagar");
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
