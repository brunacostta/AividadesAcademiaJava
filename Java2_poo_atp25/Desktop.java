//Crie uma classe desktop que herda de computador com os atributos públicos: 
//tamanho gabinete, monitor externo e fonte.

package Java2_poo_atp25;

public class Desktop extends Computador{
    public int tamanho_gabinete;
    public String monitor_externo;
    public String fonte;

// Crie uma sobrescrita do método toString nas três classes para imprimir todos os dados.
    @Override
    public String toString() {
        return this.marca + " " + this.memoria + " " + this.processador + " " + this.disco_rigido 
        + " " + this.tamanho_gabinete + " " + this.monitor_externo + " " + this.fonte;
    }
}
