package Java2_poo_atp27.models;

//Crie um sistema de cadastro de Filmes e Séries
public class Filmes {
    //Os modelos devem possuir um id e outros atributos públicos de sua escolha.
    public int id;
    public String titulo_filme;
    public String genero_filme;
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Filmes) {
            Filmes outro = (Filmes)obj;
            if (this.id == outro.id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nID: " + this.id + " || " + "Titudo do Filme: " + this.titulo_filme + " || " + "Genero do filme: " + this.genero_filme;
    }
}
