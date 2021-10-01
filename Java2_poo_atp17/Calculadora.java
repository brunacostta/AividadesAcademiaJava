package Java2_poo_atp17;

public class Calculadora {
    public static void main(String[] args) {

        cabecalho();

        CalculoImposto cc1 = new CalculoImposto();
        cc1.calculoIss(1800.00);
        cc1.calculoIof(1800.00);
        cc1.calculoIr(1800.00);
        
        System.out.println("\n O valor ");
    }

    static void cabecalho() {
        System.out.println("\n\t------------- Calculadora de Impostos ---------------");
        System.out.println("\t=====================================================");
        
    }
    
}
