package Java2_poo_atp23.CadastroLivros.controller;

import java.util.ArrayList;

import Java2_poo_atp23.CadastroLivros.model.Livro;

public class LivroController {
    private ArrayList<Livro> livros = new ArrayList<Livro>();

     public void salvar(Livro livro) {
        livros.add(livro);
    }

    public ArrayList<Livro> listar() {
        return livros;
    }

    public void alterar(Livro lvr) {
        Livro livroauxiliar = null;
        //procura livro na lista
        for (Livro livro : listar()){
        
            if (livro.getId() == lvr.getId()) {
                livroauxiliar = livro;  
            }
        }
        //se achou o libro ele substitui
        if (livroauxiliar != null) {
            this.deletar(livroauxiliar);
            this.salvar(lvr); 
        }
    }

    public void deletar(Livro livro) {
        livros.remove(livro);
    }

}
