package Java2_poo_atp16;

import java.util.Scanner;

public class CalculadoraTaxas {
    private double saldoConta = 1000.00;
    private double taxaSaque = 1.30;  
    private int qtdaSaque;
    protected double taxaTranfer = 0.001;
    
    public double valorSaque = 100.00;

    static int ler(String mensagem){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensagem);
        int numero = Integer.parseInt(sc.nextLine());
        return numero;
    }

    public void menu(){
        System.out.println("\n|1|Sacar  |2|Transferir  |3|Sair");
        int opcao = ler("Digite uma das opções do menu:");
        selecionar_menu(opcao);
    }

    public void selecionar_menu(int opcao){
        switch(opcao){
            case 1:  
                System.out.printf("Opção escolhida: Sacar \n");
            break;
            case 2:
                System.out.println("Opção escolhida: Transferir");
            break;
            case 3:
                System.out.println("Aplicação Finalizada!");
            break;
            }
     }
    
    public void calculoTaxaTransfer() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o valor que deseja transferir: R$ ");
        double valorTransfer = Double.parseDouble(sc.nextLine());
        double resultado = valorTransfer * taxaTranfer;
        System.out.printf("\nO valor da taxa de transferencia é de: R$ %.2f ", resultado);
    }

    
    
}
