//Crie uma classe computador com atributos públicos: marca, memoria ram, processador e disco rigido.

package Java2_poo_atp25;

public class Computador {
    public String marca;
    public String memoria;
    public String processador;
    public int disco_rigido; 
    
// Crie uma sobrescrita do método toString nas três classes para imprimir todos os dados.
    @Override
    public String toString() {
        return "\nMarca: " + this.marca + " || " + " Memória: " + this.memoria + " || " 
        + " Processador: " + this.processador + " || " + " Disco Rigido: " + this.disco_rigido;
    }
}
