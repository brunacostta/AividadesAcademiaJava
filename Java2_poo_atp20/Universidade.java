package Java2_poo_atp20;

public class Universidade {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        f1.setNome("Ana");
        f1.setSobrenome("Costa");
        f1.setMatricula(5698);
        f1.setSalario(9654.00);
        f1.setDepartamento("Secretaria");

        Coordenador c1 = new Coordenador();
        c1.setNome("Alex");
        c1.setSobrenome("Souza");
        c1.setMatricula(8965);
        c1.setCurso_coordenado("Analise e Desenvolvimento");
        c1.setBonus(2000.00);

        Aluno a1 = new Aluno();
        a1.setNome("Melissa");
        a1.setSobrenome("Pires");
        a1.setMatricula(4215);;
        a1.setCurso("Engenharia");
        a1.setTurma("1DEN");

        System.out.printf("\n== Funcionario == \nNome: %s %s \nMatricula: %d \nSalário: R$ %.2f \nDepartamento: %s \n", 
        f1.getNome(), f1.getSobrenome(),f1.getMatricula(), f1.getSalario(), f1.getDepartamento());

        System.out.printf("\n== Coordenador == \nNome: %s %s \nMatricula: %d \nCurso: %s \nBonus: %.2f \n", 
        c1.getNome(), c1.getSobrenome(), c1.getMatricula(), c1.getCurso_coordenado(), c1.getBonus());

        System.out.printf("\n== Aluno == \nNome: %s %s \nMatricula: %d \nCurso: %s \nTurma: %s \n", 
        a1.getNome(), a1.getSobrenome(), a1.getMatricula(), a1.getCurso(), a1.getTurma());
        
    }
}
