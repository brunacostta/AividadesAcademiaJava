package Java2_poo_atp23.CadastroLivros.view;

import java.util.ArrayList;
import java.util.Scanner;

import Java2_poo_atp23.CadastroLivros.controller.LivroController;
import Java2_poo_atp23.CadastroLivros.model.Livro;

public class LivroView {
    public static void main(String[] args) {
        LivroController controller = new LivroController();
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            opcao = menu(sc);
            switch (opcao) {
                case 1:
                    entradas(controller);
                break;
                case 2:
                    listar(controller);
                break;
                default:
                System.out.println("Valor inválido!");
            }
        } while (opcao != 0);
    }

    private static int menu(Scanner sc) {
        System.out.print("\n\t1-Cadastrar\n\t2-Listar\n\t0-Sair\n\n\tEscolha uma opção:");
        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;
    }

    private static void entradas(LivroController controller) {
        Livro livro1 = new Livro(23);
        livro1.titulo = "Céu e Mar";
        livro1.editora = "Nuvem";
        livro1.autor = "Jorge Augusto";
        controller.salvar(livro1);
    }

    private static void listar(LivroController controller) {
        ArrayList<Livro> lista = controller.listar();
        for (Livro livro : lista) {
            System.out.printf("\nID: %d \nNome: %s \nEditora: %s \nAutor:%s \n", livro.id, livro.titulo, livro.editora, livro.autor);
        }
    }
}
