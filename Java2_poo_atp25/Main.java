// Crie uma classe Main com um método main.

package Java2_poo_atp25;

public class Main {
    public static void main(String[] args) {
    // Crie um objeto da classe Computador e atribua valores para as propriedade de cada objeto.
        Computador computador = new Computador();
        computador.marca = "Dell";
        computador.processador = "Intel";
        computador.memoria = "32M";
        computador.disco_rigido = 250;

    // Crie um objeto da classe Notebook e atribua valores para as propriedade de cada objeto.
        Notebook notebook = new Notebook();
        notebook.bateria = 24;
        notebook.velocidade_wifi = 5;
        notebook.versão_bluetooth = 3.2;

    // Crie um objeto da classe Desktop e atribua valores para as propriedade de cada objeto.
        Desktop desktop = new Desktop();
        desktop.tamanho_gabinete = 5;
        desktop.monitor_externo = "Sim";
        desktop.fonte = "Bivolt";

    // Crie um objeto da classe Object através da instância da classe Computador.
        Object obj1 = computador;

    // Crie um objeto da classe Object através da instância da classe Notebook.
        Object obj2 = notebook;

    // Crie um objeto da classe Object através da instância da classe Desktop.
        Object obj3 = desktop;

    // Converta o primeiro objeto da Object novamente para um novo objeto da classe Computador.
        Computador computador1 = (Computador)obj1;

    // Converta o segundo objeto da Object novamente para um novo objeto da classe Notebook.
        Notebook notebook1 = (Notebook)obj2;

    // Converta o terceiro objeto da Object novamente para um novo objeto da classe Desktop.
        Desktop desktop1 = (Desktop)obj3;

    // Imprima todos dos dados do objeto de Computador convertido através do toString.
        imprimir(computador1);

    // Imprima todos dos dados do objeto de Notebook convertido através do toString.
        imprimir(notebook1);

    // Imprima todos dos dados do objeto de Desktop convertido através do toString.
        imprimir(desktop1);
    }

    public static void imprimir(Object obj) {
        System.out.println(obj);
    }  
}
