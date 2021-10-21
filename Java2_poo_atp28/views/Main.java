package Java2_poo_atp28.views;

import Java2_poo_atp28.controllers.PJController;
import Java2_poo_atp28.controllers.PessoaFisicaController;
import Java2_poo_atp28.models.Endereco;
import Java2_poo_atp28.models.PessoaFisica;
import Java2_poo_atp28.models.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        PessoaFisicaController pf = new PessoaFisicaController();

        PessoaFisica pf1 = new PessoaFisica();
        pf1.id = 8974;
        pf1.nome = "Amaral";
        pf1.cpf = "125433655";
        pf1.rg = "25422553";
        
        Endereco end_pf1 = new Endereco();
        end_pf1.logradouro = "Rua";
        end_pf1.endereço = "Maua";
        end_pf1.numero = "23";
        end_pf1.bairro = "Horizonte";
        end_pf1.cidade = "Rio Preto";
        end_pf1.estado = "Ceara";

        pf1.enderecoResidencial = end_pf1;
        pf1.enderecoComercial = end_pf1;
        
        pf.create(pf1);
        for (PessoaFisica pessoa : pf.read()) {
            System.out.printf("\nPessoa Fisica cadastrada! %s ", pessoa
            );
        }

        PessoaFisica pf2 = new PessoaFisica();
        pf2.id = 89769;
        pf2.nome = "Joana";
        pf2.cpf = "00541254";
        pf2.rg = "89682441";

        Endereco end_pf2 = new Endereco();
        end_pf2.logradouro = "Av";
        end_pf2.endereço = "Pira";
        end_pf2.numero = "60";
        end_pf2.bairro = "Apoador";
        end_pf2.cidade = "Ribeirão";
        end_pf2.estado = "Rio de Janeiro";

        pf2.enderecoResidencial = end_pf2;
        pf2.enderecoComercial = end_pf2;

        pf.update(pf2);
        for (PessoaFisica pessoa : pf.read()) {
            System.out.printf("\nPessoa criada com sucesso! %s ", pf2);
        }

        pf.delete(pf2);
        for (PessoaFisica pessoa : pf.read()) {
            System.out.println("\nCadastro deletado!");
        }

        System.out.println("\n========================================================");
        System.out.println("========================================================");

        PJController pj = new PJController();

        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.id = 7485;
        pj1.nome = "Ameli Comercial Limitada";
        pj1.cnpj = "00541254/24145";
        pj1.ie = 454589;

        Endereco end_pj1 = new Endereco();
        end_pj1.logradouro = "Rua";
        end_pj1.endereço = "Azul";
        end_pj1.numero = "11";
        end_pj1.bairro = "Raio";
        end_pj1.cidade = "Rio de Janeiro";
        end_pj1.estado = "Acre";

        pj1.enderecoResidencial = end_pj1;
        pj1.enderecoComercial = end_pj1;
        

        pj.create(pj1);
        for (PessoaJuridica juridica : pj.read()) {
            System.out.printf("\nPessoa Juridica cadastrada! %s ", juridica
            );
        }
    }
}
