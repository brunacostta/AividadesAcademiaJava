package Java2_poo_atp22.ex2;

public class TelaBanco {
    public static void main(String[] args) {
        cabecalho();

        ContaCorrente cc1 = new ContaCorrente(5000.00, 45);
        cc1.saque(2500.00);
        cc1.deposito(50.00);

        System.out.println(cc1);
    }

    static void cabecalho() {
        System.out.println("\n========== Tela Banco ============"); 
    }
}
