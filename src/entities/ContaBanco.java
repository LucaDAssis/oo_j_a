package entities;

public class ContaBanco {

    private int numConta;
    private String name;
    private double valorInicial;


    public ContaBanco(){
    }

    public ContaBanco(int numConta, String name) {
        this.numConta = numConta;
        this.name = name;
    }

    public ContaBanco(int numConta, String name, double valorInicial) {
        this.numConta = numConta;
        this.name = name;
        this.valorInicial = valorInicial;
    }

    public String getName() {
        return name;
    };

    public void setName(String name) {
        this.name = name;
    }

    public double getValorInicial() {
        return valorInicial;
    };

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void depositar(double valor) {
        this.valorInicial += valor;
    }

    public void sacar(double valor) {
        this.valorInicial -= valor + 5;
    }

    @Override
    public String toString() {
        return name + ", " + valorInicial + ", " + numConta;
    }
}
