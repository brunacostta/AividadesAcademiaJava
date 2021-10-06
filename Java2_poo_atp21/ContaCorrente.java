package Java2_poo_atp21;

public class ContaCorrente extends Conta{

    private double taxa_transferencia = 10.50;
    private double taxa_manutencao = 2.50;
    private int numero_transferencia = 0;

    @Override
    public void transferencia(double valor_transfer) {
        super.transferencia(valor_transfer);
        double saldo_atualizado = this.getSaldo() - taxa_transferencia;
        this.setSaldo(saldo_atualizado);

        if (numero_transferencia %5==1){
            double saldoFinal = saldo_atualizado - taxa_manutencao;
            setSaldo(saldoFinal);
        }
        this.numero_transferencia++;      
    }
}
    

