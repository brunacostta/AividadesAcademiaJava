package Java2_poo_atp28.models;

public class PessoaFisica extends Pessoa{
    public String cpf;
    public String rg;
    
    @Override
    public String toString() {
        return super.toString() + "\nCPF: " + this.cpf + " | RG: " + this.rg + "\n";
    }
}
