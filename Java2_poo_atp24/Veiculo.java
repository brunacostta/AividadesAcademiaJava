// Crie uma classe veiculo com atributos públicos: marca, modelo e placa.
package Java2_poo_atp24;

public class Veiculo {
    public String marca;
    public String modelo;
    public String placa;

    @Override
    public String toString() {
        return "\nMarca: " + this.marca + " || " 
        + " Modelo: " + this.modelo + " || " + " Placa: " + this.placa;
    }
}
