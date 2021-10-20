package Java2_poo_atp26;

//Crie uma classe Main com um método main.
public class Main {
    public static void main(String[] args) {
    //Crie um objeto da classe Pessoa, um da classe Aluno e atribua valores para as propriedade de cada objeto.
    Pessoa pessoa = new Pessoa();
    pessoa.nome = "Ana";
    pessoa.sobrenome = "Silva";
    pessoa.idade = 23;

    Aluno aluno = new Aluno();  
    aluno.nome = "Ana";
    aluno.sobrenome = "Silva";
    aluno.idade = 23;
    aluno.matricula = "RT89456";
    aluno.turma = "2DADS";
    aluno.curso = "Analise e Desenvolvimento de Sistemas";

    //Crie um objeto da classe Dados e chame o metodo para adicionar os objetos de Pessoa e Aluno ao array.
    Dados dados = new Dados();
    System.out.println(dados.add(pessoa));
    System.out.println(dados.add(aluno));

    //Crie um novo objeto para Pessoa e atribua os mesmos dados da pessoa criada anteriormente.
    Pessoa pessoa2 = new Pessoa();
    pessoa2.nome = "Ana";
    pessoa2.sobrenome = "Silva";
    pessoa2.idade = 23;

    Aluno aluno2 = new Aluno();
    aluno2.nome = "Ana";
    aluno2.sobrenome = "Silva";
    aluno2.idade = 23;  
    aluno2.matricula = "RT89456";
    aluno2.turma = "2DADS";
    aluno2.curso = "Analise e Desenvolvimento de Sistemas";

    //Utilize o método de dados para verificar se a novo objeto ja esta salvo no array.
    System.err.println(pessoa.equals(pessoa2));

    System.out.println(dados.add(pessoa2));
    System.out.println(dados.add(aluno2));
   
    System.out.println(dados.verifica(pessoa));
    System.out.println(dados.verifica(aluno));
    System.out.println(dados.verifica(pessoa2));
    System.out.println(dados.verifica(aluno2));
    

    //Tamanho da minha lista
    System.out.println(dados.size());
        
    System.out.println(pessoa);
    System.out.println(aluno);
    System.out.println(pessoa2);
    System.out.println(aluno2);

    //Remova o aluno do array, utilizando o método da classe Dados.
    System.out.println(dados.remove(pessoa2));
    System.out.println(dados.remove(aluno2));
    System.out.println(dados.size()); 
    
    }
}
