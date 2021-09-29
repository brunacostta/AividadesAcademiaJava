package Java2_poo_atp15;

public class Principal {

    public static void main(String[] args) {

        cabecalho();

        Pessoa p1 = new Pessoa();
        p1.nome = "Bruna";
        p1.sobrenome = "Bittencourt";
        p1.idade = 31;

        Pessoa p2 = new Pessoa();
        p2.nome = "Thiago";
        p2.sobrenome = "Bittencourt";
        p2.idade = 35;

        System.out.printf("%s %s %d", p1.nome, p1.sobrenome, p1.idade);
        System.out.printf("\n%s %s %d", p2.nome, p2.sobrenome, p2.idade);
        
    }
    static void cabecalho(){
        System.out.println("\n\t*************** Cadastro de Pessoa com classe ********************");
    }
}
