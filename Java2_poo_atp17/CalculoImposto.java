package Java2_poo_atp17;

public class CalculoImposto {

    private double taxaIss = 5.0;
    private double taxaIof = 4.08;
    private double taxaIr = 7.5;
    
    public double calculoIss(double salario) {
        double resultadoIss = salario * taxaIss;
        return resultadoIss;
        
    }

    public double calculoIof(double salario) {
        double resultadoIof = salario * taxaIof;
        return resultadoIof;
        
    }

    public double calculoIr(double salario) {
        double resultadoIr = salario * taxaIr;
        return resultadoIr;
    }
}
