package Java2_poo_atp20;

public class Universidade {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        f1.setSalario(9654.00);
        f1.setDepartamento("Secretaria");

        Coordenador c1 = new Coordenador();
        c1.setCurso_coordenado("Analise e Desenvolvimento");
        c1.setBonus(2000.00);

        Aluno a1 = new Aluno();
        a1.setCurso("Engenharia");
        a1.setTurma("1DEN");

        System.out.printf("\n== Funcionario == \nSalário: R$ %.2f \nDepartamento: %s \n", 
        f1.getSalario(), f1.getDepartamento());

        System.out.printf("\n== Coordenador == \nCurso: %s \nBonus: %.2f \n", 
        c1.getCurso_coordenado(), c1.getBonus());

        System.out.printf("\n== Aluno == \nCurso: %s \nTurma: %s \n", 
        a1.getCurso(), a1.getTurma());
        
    }
}
