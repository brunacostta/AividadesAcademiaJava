// Crie uma classe Main com um método main.

package Java2_poo_atp24;

public class Main {
    public static void main(String[] args) {

    // Crie um objeto de classe Veículo e atribua valores para as propriedade de cada objeto.
        Veiculo veiculo = new Veiculo();
        veiculo.marca = "Fiat";
        veiculo.modelo = "Uno";
        veiculo.placa = "rtd-1253";
    
    // Crie um objeto de classe Carro e atribua valores para as propriedade de cada objeto.
        Carro carro = new Carro();
        carro.numero_portas = 4;
        carro.capacidade_porta_malas = 150;

    // Crie um objeto da classe Object através da instância da classe Veículo.
        Object obj1 = veiculo;

    // Crie um objeto da classe Object através da instância da classe Carro.
        Object obj2 = carro;

    // Converta o primeiro objeto da Object novamente para um novo objeto da classe Veículo.
        Veiculo veiculo1 = (Veiculo)obj1;

    // Converta o segundo objeto da Object novamente para um novo objeto da classe Carro.
        Carro carro1 = (Carro)obj2;

    // Imprima todos dos dados do objeto de Veículo convertido.
        imprimir(veiculo1);

    // Imprima todos dos dados do objeto de Carro convertido.
        imprimir(carro1);

    }

    public static void imprimir(Object obj) {
        System.out.println(obj);
    }
}
