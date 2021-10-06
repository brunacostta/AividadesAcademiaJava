package Java2_poo_atp21;

public class Conta {

    private double saldo;
    private int codigo_cliente;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public void transferencia(double valor_transfer) {
        saldo -= valor_transfer;                
    }
    
}
