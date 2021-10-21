package Java2_poo_atp28.models;

public abstract class Pessoa extends Base{
    
    public String nome; 
    public Endereco enderecoResidencial; 
    public Endereco enderecoComercial;
      
    @Override
    public String toString() {
        return "\n" + this.nome + this.enderecoResidencial + this.enderecoComercial;
   }
}
