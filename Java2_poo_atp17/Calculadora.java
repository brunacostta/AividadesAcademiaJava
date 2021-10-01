package Java2_poo_atp17;

public class Calculadora {
    public static void main(String[] args) {
        cabecalho();

        CalculoImposto cc1 = new CalculoImposto();
        double taxaIss = cc1.calculoIss(1800.00);
        double taxaIof = cc1.calculoIof(1800.00);
        double taxaIr = cc1.calculoIr(1800.00);
        
        System.out.printf("O valor do ISS que será descontado é de: R$ %.2f ", taxaIss);
        System.out.printf("\nO valor do IOF que será descontado é de: R$ %.2f ", taxaIof);
        System.out.printf("\nO valor do IR que será descontado é de: R$ %.2f ", taxaIr);
    }

    static void cabecalho() {
        System.out.println("\n\t------------- Calculadora de Impostos ---------------");
        System.out.println("\t=====================================================");
    } 
}
