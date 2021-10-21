package Java2_poo_atp28.views;

import Java2_poo_atp28.controllers.PessoaFisicaController;
import Java2_poo_atp28.models.Endereco;
import Java2_poo_atp28.models.PessoaFisica;

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
        end_pf2.logradouro = "Rua";
        end_pf2.endereço = "Pirapora";
        end_pf2.numero = "84";
        end_pf2.bairro = "Vale";
        end_pf2.cidade = "Ribeirão";
        end_pf2.estado = "São Paulo";

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
    }
}
