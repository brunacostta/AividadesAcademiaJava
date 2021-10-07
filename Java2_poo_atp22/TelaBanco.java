package Java2_poo_atp22;

public class TelaBanco {
    public static void main(String[] args) {
        
        ContaCorrente cc1 = new ContaCorrente(5000.00, 45);
        cc1.saque(2500.00);
        cc1.deposito(50.00);

        System.out.println(cc1);
    }
}
