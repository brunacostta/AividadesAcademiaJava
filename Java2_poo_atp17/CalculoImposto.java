package Java2_poo_atp17;

public class CalculoImposto {

    private double taxaIss = 0.05;
    private double taxaIof = 0.0408;
    private double taxaIr = 0.075;
    
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
