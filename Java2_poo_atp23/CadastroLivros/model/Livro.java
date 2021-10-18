package Java2_poo_atp23.CadastroLivros.model;

public class Livro {
    public String titulo;
    public String editora;
    public String autor;
    public int id;

    public Livro(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }
    
}
