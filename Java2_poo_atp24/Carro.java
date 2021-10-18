package Java2_poo_atp24;

public class Carro {
    public int numero_portas;
    public int capacidade_porta_malas;
    
    @Override
    public String toString() {
        return "Numero de portas: " + this.numero_portas + " || " + " Capacidade porta-malas: " + this.capacidade_porta_malas;
    }
}
