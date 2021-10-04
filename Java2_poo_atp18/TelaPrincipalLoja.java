package Java2_poo_atp18;

public class TelaPrincipalLoja {

    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.setCodigo(10);
        System.out.println(p1.getCodigo());

        p1.setNome("Bruna");
        System.out.println(p1.getNome());

        p1.setDescricao("Hidratante para as mãos");
        System.out.println(p1.getDescricao());

        p1.setValor(19.99);
        System.out.println(p1.getValor());

    }
    
}
