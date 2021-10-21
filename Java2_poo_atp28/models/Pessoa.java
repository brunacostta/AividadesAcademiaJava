package Java2_poo_atp28.models;

public abstract class Pessoa extends Base{
    
    public String nome; 
    public Endereco enderecoResidencial; 
    public Endereco enderecoComercial;
      
    @Override
    public String toString() {
        return "\nId: " + this.id + "\nNome: " + this.nome + "\nEndereço Residencial" + this.enderecoResidencial + "\n" + "\nEndereço Comercial" + this.enderecoComercial;
   }
}
