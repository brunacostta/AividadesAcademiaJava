package Java2_poo_atp24;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.marca = "Fiat";
        veiculo.modelo = "Uno";
        veiculo.placa = "rtd-1253";

        Carro carro = new Carro();
        carro.numero_portas = 4;
        carro.capacidade_porta_malas = 150;

        Object obj1 = veiculo;
        Object obj2 = carro;

        Veiculo veiculo1 = (Veiculo)obj1;
        Carro carro1 = (Carro)obj2;

        imprimir(veiculo1);
        imprimir(carro1);

    }

    public static void imprimir(Object obj) {
        System.out.println(obj);
    }
}
