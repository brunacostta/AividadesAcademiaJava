package Java2_poo_atp21;

public class Teste {
    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        c1.setCodigo_cliente(12);
        c1.setSaldo(8000.00);
        double saldo = c1.getSaldo();
        c1.transferencia(200.00);

        ContaCorrente cc1 = new ContaCorrente();
        cc1.setCodigo_cliente(24);
        cc1.setSaldo(22000.00);
        double saldo_cc1 = cc1.getSaldo();
        cc1.transferencia(2000.00);
        cc1.transferencia(2000.00);
        cc1.transferencia(2000.00);
        cc1.transferencia(2000.00);
        cc1.transferencia(2000.00);
        cc1.transferencia(1000.00);
        cc1.transferencia(2000.00);
        cc1.transferencia(2000.00);
        cc1.transferencia(2000.00);
        cc1.transferencia(2000.00);
        cc1.transferencia(1000.00);

        System.out.printf("\n== Conta == \nCódigo Cliente: %d \nSaldo Conta: R$ %.2f \nSaldo Atualizado após transferencia: R$ %.2f \n", c1.getCodigo_cliente(), saldo,  c1.getSaldo());
        System.out.printf("\n== Conta == \nCódigo Cliente: %d \nSaldo Conta: R$ %.2f \nSaldo Atualizado após transferencia: R$ %.2f \n", cc1.getCodigo_cliente(), saldo_cc1,  cc1.getSaldo());
           
    
    }
    
}
