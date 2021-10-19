//Crie uma classe Aluno que herda de pessoa e que possua os atributos públicos: matricula, turma e curso.

package Java2_poo_atp26;

public class Aluno extends Pessoa{
    public String matricula;
    public String turma;
    public String curso;

    //Crie uma sobrescrita do método equals nas duas classes para comparar os dados especificos de cada uma.
    @Override
    public boolean equals(Object obj) {
        Aluno outro_aluno = (Aluno)obj;

        if (this.matricula.equals(outro_aluno.matricula) && this.turma.equals(outro_aluno.turma) && this.curso.equals(outro_aluno.curso)) {
            return true;
        } else {
            return false;
        }
    }

    //Crie uma sobrescrita do método toString nas duas classes para imprimir todos os dados
    @Override
    public String toString() {
        return "\nMatricula: " + this.matricula + " || " + "Turma: " + this.turma + " || " + "Curso: " + this.curso;
    }
}
