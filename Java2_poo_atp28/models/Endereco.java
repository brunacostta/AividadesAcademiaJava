package Java2_poo_atp28.models;

public class Endereco extends Base {
    
    public String logradouro;
    public String endereço;
    public String numero;
    public String bairro;
    public String cidade;
    public String estado;

    @Override
    public String toString() {
        return "\nLogradouro: " + this.logradouro + " " + this.endereço +" "+ this.numero + "\nBairro: " + this.bairro + " | Cidade: " +this.cidade + " | Estado: " + this.estado;
    }
}
