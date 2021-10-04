package Java2_poo_atp18;

public class TelaPrincipalLoja {

    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.setCodigo(10);
        System.out.printf("\nO código do cliente é: %d ", p1.getCodigo());

        p1.setNome("Bruna");
        System.out.printf("\nO nome do cliente é: %s", p1.getNome());

        p1.setDescricao("Hidratante para as mãos");
        System.out.printf("\nDescrição do produto: %s ", p1.getDescricao());

        p1.setValor(19.99);
        System.out.printf("\nO valor do produto é: R$ %.2f ", p1.getValor());

    }
    
}
