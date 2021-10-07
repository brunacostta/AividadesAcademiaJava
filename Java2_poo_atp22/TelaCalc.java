package Java2_poo_atp22;

public class TelaCalc {
    public static void main(String[] args) {
        
        Calculadora calculo = new Calculadora();
    
        int result1 = calculo.soma(25, 30);
        double result2 = calculo.soma(50.62, 10.20);
        float result3 = calculo.soma(897, 1263, 10);
        long result4 = calculo.soma(856, 157, 9);

        System.out.printf("\nInt: %d \nDouble: %f \nFloat: %f \nLong: %d ", result1, result2, result3, result4);
    }
}
