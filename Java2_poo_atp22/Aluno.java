package Java2_poo_atp22;

public class Aluno {
    private String nome_completo;
    private int idade;
    private int matricula;

    
    
    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }
    
    public String getNome_completo() {
        return nome_completo;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    @Override
    public String toString() {
        String dado_aluno = this.nome_completo + "\n" + this.idade + "\n" + this.matricula;
        return dado_aluno;
    }
}
