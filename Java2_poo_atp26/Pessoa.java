//Crie uma classe Pessoa com os atributos públicos: nome, sobrenome e idade.

package Java2_poo_atp26;

public class Pessoa {
    public String nome;
    public String sobrenome;
    public int idade;

    //Crie uma sobrescrita do método equals nas duas classes para comparar os dados especificos de cada uma.
    @Override
    public boolean equals(Object obj) {
        Pessoa outra_pessoa = (Pessoa)obj;
      
        if (this.nome.equals(outra_pessoa.nome) && this.sobrenome.equals(outra_pessoa.sobrenome) && this.idade == outra_pessoa.idade) {
            return true;
        } else {
            return false;
        }  
    }
}
