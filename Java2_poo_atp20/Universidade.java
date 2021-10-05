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
        
    }
}
