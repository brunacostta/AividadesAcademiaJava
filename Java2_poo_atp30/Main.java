package Java2_poo_atp30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        cabecalho();

        int opcao;
        do {
            opcao = menu(sc);
            switch (opcao) {
                case 1:
                    soma(calc, sc);
                    break;
                case 2:
                    subtracao(calc, sc);
                    break;

                case 3:
                    multiplicacao(calc, sc);
                    break;

                case 4:
                    divisao(calc, sc);
                    break;
            
                default:
                    break;
            }
            
        } while (opcao != 0);

    }

    //O sistema deve possuir um tratamento de exceção durante a leitura dos dados para evitar que o usuário insira algo diferente de números inteiros tanto para as operação quanto para o menu.

    static void cabecalho() {
        System.out.println("\n\t>>>>>>>>>>>>>>>> Olá, Bem Vindo! <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("\t>>>>>>>>>>>>>>>> Calculadora com Exceção <<<<<<<<<<<<<<<<<<<<<<<");
    }
    
    private static int menu(Scanner sc) {
        System.out.print("\n\t|1| SOMA \t|2| SUBTRAÇÃO \t|3| MULTIPLICAÇÃO \t|4| DIVISÃO \t|0| Sair \n\t>>>>>>>>> Escolha uma opção do menu acima: ");
        int opcao = 0;
        
        try {
            opcao = Integer.parseInt(sc.nextLine());
            if (opcao < 0 || opcao > 5) {
                throw new IllegalArgumentException("\n\t>>>>>>> Opção digitada não existe no menu!");
             }
                
        } catch (NumberFormatException ex) {
            System.out.println("\n\t>>>>>>>>>>> Digite um número inteiro.");
            opcao = -1;
    
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
            }
        
        return opcao;
    }

        private static void soma(Calculadora n, Scanner sc){
        Calculadora calc = new Calculadora();
        System.out.print("\n\tDigite o primeiro numero: ");
        int nm1 = 0;

        try {
            nm1 = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
            System.out.println("\n\tDigite um número inteiro!");
            soma(calc, sc);
        }
        
        System.out.print("\n\tDigite o segundo numero: ");
        int nm2 = 0;
        boolean validador = false;

        do {
            try {
                nm2 = Integer.parseInt(sc.nextLine());
                validador = true;
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
                System.out.println("\n\tDigite um número inteiro!");         
            }
        } while (validador != true);

        int outro = calc.soma(nm1, nm2);
        System.out.printf("\n\t<<<<< A soma dos números é igual a: %s >>>>>", outro);
    }

    private static void subtracao(Calculadora n, Scanner sc){
        Calculadora calc = new Calculadora();
        System.out.print("\n\tDigite o primeiro numero: ");
        int nm1 = 0;
        try {
            nm1 = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
            System.out.println("\n\tDigite um número inteiro!");
            subtracao(calc, sc);
        }
        
        System.out.print("\n\tDigite o segundo numero: ");
        int nm2 = 0;
        boolean validador = false;

        do {
            try {
                nm2 = Integer.parseInt(sc.nextLine());
                validador = true;
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
                System.out.println("\n\tDigite um número inteiro!");         
            }
        } while (validador != true);

        int outro = calc.subtracao(nm1, nm2);
        System.out.printf("\n\t<<<<< A subtração dos números é igual a: %s >>>>>", outro);
    }

    private static void multiplicacao(Calculadora n, Scanner sc){
        Calculadora calc = new Calculadora();
        System.out.print("\n\tDigite o primeiro numero: ");
        int nm1 = 0;
        try {
            nm1 = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
            System.out.println("\n\tDigite um número inteiro!");
            multiplicacao(calc, sc);
        }
        
        System.out.print("\n\tDigite o segundo numero: ");
        int nm2 = 0;
        boolean validador = false;

        do {
            try {
                nm2 = Integer.parseInt(sc.nextLine());
                validador = true;
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
                System.out.println("\n\tDigite um número inteiro!");         
            }
        } while (validador != true);

        int outro = calc.multiplicacao(nm1, nm2);
        System.out.printf("\n\t<<<<< A multiplicação dos números é igual a: %s >>>>>", outro);
    }

    private static void divisao(Calculadora n, Scanner sc){
        Calculadora calc = new Calculadora();
        System.out.print("\n\tDigite o primeiro numero: ");
        int nm1 = 0;
        try {
            nm1 = Integer.parseInt(sc.nextLine());
            if (nm1 == 0) {
                throw new ArithmeticException("\n\t>>>>>>>>>>>>> O número não pode ser divisível por 0");
            }
            
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
            System.out.println("\n\tDigite um número inteiro!");
            divisao(calc, sc);

        } 
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
            divisao(calc, sc);
        }
        
        System.out.print("\n\tDigite o segundo numero: ");
        int nm2 = 0;
        boolean validador = false;

        do {
            try {
                nm2 = Integer.parseInt(sc.nextLine());
                validador = true;
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
                System.out.println("\n\tDigite um número inteiro!");         
            }
        } while (validador != true);

        int outro = calc.divisao(nm1, nm2);
        System.out.printf("\n\t<<<<< A divisão dos números é igual a: %s >>>>>", outro);
    }
}
