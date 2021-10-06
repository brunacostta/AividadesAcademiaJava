package Java2_poo_atp21;

public class Teste {
    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        c1.setCodigo_cliente(12);
        c1.setSaldo(8000.00);

        ContaCorrente cc1 = new ContaCorrente();
        cc1.setCodigo_cliente(12);
        cc1.setSaldo(12000.00);
    }
    
}
