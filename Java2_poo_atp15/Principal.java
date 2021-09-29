package Java2_poo_atp15;

public class Principal {

    public static void main(String[] args) {

        cabecalho();

        Pessoa p1 = new Pessoa();
        p1.nome = "Bruna";
        p1.sobrenome = "Bittencourt";
        p1.idade = 31;
        
    }
    static void cabecalho(){
        System.out.println("\n\t*************** Cadastro de Pessoa com classe ********************");
    }
}
