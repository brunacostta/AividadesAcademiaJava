package Java2_poo_atp28.models;

public class PessoaFisica extends Pessoa{
    public String cpf;
    public String rg;
    
    @Override
    public String toString() {
        return "\nId: " + this.id + "\nNome: " + this.nome + "\nCPF: " + this.cpf + " | RG: " + this.rg + super.toString() + "\n";
    }
}
