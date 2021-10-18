//Crie uma classe notebook que herda de computador com 
//os atributos públicos: bateria, velocidade wifi e versão bluetooth.

package Java2_poo_atp25;

public class Notebook extends Computador {
    public int bateria;
    public int velocidade_wifi;
    public double versão_bluetooth;

// Crie uma sobrescrita do método toString nas três classes para imprimir todos os dados.
    @Override
    public String toString() {
        return this.marca + " " + this.memoria + " " + this.processador + " " + this.disco_rigido 
        + " " + this.bateria + " " + this.velocidade_wifi + " " + this.versão_bluetooth;
    }
}
