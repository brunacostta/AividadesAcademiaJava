package Java2_poo_atp16;

public class CalculadoraTaxas {
    private double saldoConta = 1000.00;
    private double taxaSaque = 1.30;  
    private int qtdaSaque;
    private double taxaTranfer = 0.001;

    public double calculoTaxaTransfer(double valorTranferencia) {
        double resultado = valorTranferencia * taxaTranfer;
        return  resultado;
    }

    public double saque(double saque){       
        saldoConta -= saque;  
        qtdaSaque++;
        if (qtdaSaque %5==0){
            saldoConta -= taxaSaque;
        }
                    
        return saldoConta;
    }

}
