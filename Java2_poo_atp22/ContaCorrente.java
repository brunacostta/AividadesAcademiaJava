package Java2_poo_atp22;

public class ContaCorrente {
    private double saldo;
    private double taxa_saque = 5.0;
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
        double saldo_deposito= this.saldo += deposito;
        return saldo_deposito;        
    }

    @Override
    public String toString() {
        String mensagem = this.saldo + "\n" + this.codigo_cliente + "\n" + this.taxa_saque;
        return mensagem;
    }
}
