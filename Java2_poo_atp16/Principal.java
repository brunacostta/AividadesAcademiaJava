package Java2_poo_atp16;

public class Principal{
    public static void main(String[] args) {

        cabecalho();
        
        CalculadoraTaxas bancoBcb = new CalculadoraTaxas();
        bancoBcb.calculoTaxaTransfer();
        
        //bancoBcb.menu();
        
                
    }

    static void cabecalho() {
        System.out.println("\n\t============ Calculadora de Taxas =============");        
    }

}


