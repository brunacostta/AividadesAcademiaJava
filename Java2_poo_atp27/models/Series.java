package Java2_poo_atp27.models;
//Crie um sistema de cadastro de Filmes e Séries
public class Series {
    //Os modelos devem possuir um id e outros atributos públicos de sua escolha.
    public int id;
    public String titulo_serie;
    public String genero_serie;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Series) {
            Series outro = (Series)obj;
            if (this.id == outro.id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nID: " + this.id + " || " + "Titudo do Serie: " + this.titulo_serie + " || " + "Genero do Serie: " + this.genero_serie;
    }
}
