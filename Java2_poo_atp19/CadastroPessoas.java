package Java2_poo_atp19;

public class CadastroPessoas {
    public static void main(String[] args) {
        PessoaFisica[] pessoa = new PessoaFisica[5];

        PessoaFisica p1 = new PessoaFisica();
        p1.setCodigo(10);
        p1.setNome("Bruna");
        p1.setSobrenome("Bittencourt");
        p1.setIdade(31);
        p1.setRg("12.365.523-32");
        p1.setCpf("987.654.321-01");

        PessoaFisica p2 = new PessoaFisica();
        p2.setCodigo(20);
        p2.setNome("Mercedes");
        p2.setSobrenome("Rocha");
        p2.setIdade(18);
        p2.setRg("12.365.523-32");
        p2.setCpf("987.654.321-01");

        PessoaFisica p3 = new PessoaFisica();
        p3.setCodigo(30);
        p3.setNome("Flor");
        p3.setSobrenome("Silva");
        p3.setIdade(26);
        p3.setRg("12.365.523-32");
        p3.setCpf("987.654.321-01");

        PessoaFisica p4 = new PessoaFisica();
        p4.setCodigo(40);
        p4.setNome("Iara");
        p4.setSobrenome("Paiva");
        p4.setIdade(38);
        p4.setRg("12.365.523-32");
        p4.setCpf("987.654.321-01");

        PessoaFisica p5 = new PessoaFisica();
        p5.setCodigo(50);
        p5.setNome("Fernanda");
        p5.setSobrenome("Costa");
        p5.setIdade(45);
        p5.setRg("12.365.523-32");
        p5.setCpf("987.654.321-01");

        pessoa[0] = p1;
        pessoa[1] = p2;
        pessoa[2] = p3;
        pessoa[3] = p4;
        pessoa[4] = p5;

        for (PessoaFisica pessoaFisica : pessoa) {
            System.out.printf("\nCódigo: %d \nNome: %s \nSobrenome %s \nIdade: %d \nRG: %s \nCPF: %s \n", 
            pessoaFisica.getCodigo(), pessoaFisica.getNome(), pessoaFisica.getSobrenome(), 
            pessoaFisica.getIdade(), pessoaFisica.getRg(), pessoaFisica.getCpf());            
        }
    }
    
}
