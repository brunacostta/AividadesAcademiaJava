package Java2_poo_atp28.models;

public class PessoaJuridica extends Pessoa{
    public String cnpj;
    public int ie;

    @Override
    public String toString() {
        return super.toString() + "\nCNPJ: " + this.cnpj+ " | IE: " + this.ie;
    }
}
