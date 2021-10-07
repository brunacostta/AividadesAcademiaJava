package Java2_poo_atp22;

public class Tela {
    public static void main(String[] args) {
        cabecalho();
        
        Aluno a1 = new Aluno();
        a1.setMatricula(33);
        a1.setNome_completo("Ana Maria Prado");
        a1.setIdade(17);

        System.out.println(a1);
    }

    static void cabecalho() {
        System.out.println("\n========== Tela Aluno ============"); 
    }
}
