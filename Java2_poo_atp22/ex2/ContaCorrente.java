package Java2_poo_atp22.ex2;

public class ContaCorrente {
    private double saldo;
    private double taxa_saque = 5.00;
    private int codigo_cliente;
    
    public ContaCorrente(double saldo, int codigo_cliente) {
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
    }

    public double saque(double saque) {
        this.saldo -= saque;
        double saldo_saque = this.saldo - this.taxa_saque;
        return saldo_saque;
    }

    public double deposito(double deposito) {
        this.saldo += deposito;
        return deposito;        
    }

    @Override
    public String toString() {
        String mensagem = "Saldo Conta Corrente: R$ " + this.saldo + "\n" + "Código Cliente: " + this.codigo_cliente + "\n" + "Valor taxa saque: R$ " + this.taxa_saque;
        return mensagem;
    }
}
