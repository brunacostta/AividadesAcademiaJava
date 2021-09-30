package Java2_poo_atp16;

import java.util.Scanner;

public class Principal{
    static Scanner sc = new Scanner(System.in);
    static CalculadoraTaxas bancoBcb = new CalculadoraTaxas();
    public static void main(String[] args) {
        boolean continua = false;
        cabecalho();
        do {
            menu();
            System.out.println("Deseja voltar ao menu principal? ");
            char resposta = sc.nextLine().toUpperCase().charAt(0);
            if (resposta == 'S'){
                continua = true;
            }else{
                System.out.println("Fim...");
            }
        } while (continua);
                
    }
    static void cabecalho() {
        System.out.println("\n\t============ Calculadora de Taxas =============");        
    }

    static void menu(){
        System.out.println("\n|1|Sacar  |2|Transferir  |3|Sair");
        int opcao = ler("Digite uma das opções do menu:");
        selecionar_menu(opcao);
    }

    static void selecionar_menu(int opcao){
        
        switch(opcao){
            case 1:  
                System.out.printf("Opção escolhida: Sacar \n");
                System.out.printf("Digite o valor do saque: R$ ");
                double saque = Double.parseDouble(sc.nextLine());
                double resultado = bancoBcb.saque(saque);
                System.out.printf("Meu saldo final é de: R$ %f \n",resultado);
            break;
            case 2:
                System.out.println("Opção escolhida: Transferir");
                System.out.printf("Digite o valor que deseja transferir: R$ ");
                double valorTransfer = Double.parseDouble(sc.nextLine());
                double taxat = bancoBcb.calculoTaxaTransfer(valorTransfer);
                System.out.printf("\nO valor da taxa de transferencia é de: R$ %.2f \n", taxat);
            break;
            case 3:
                System.out.println("Aplicação Finalizada!");
            break;
            }
        }
        static int ler(String mensagem){
            
            System.out.print(mensagem);
            int numero = Integer.parseInt(sc.nextLine());
            return numero;
        }
}


