package Java2_poo_atp30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

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

    private static int menu(Scanner sc) {
        System.out.print("\n\t1-SOMA\n\t2-SUBTRAÇÃO\n\t3-MULTIPLICAÇÃO\n\t4-DIVISÃO\n\t0-Sair\n\n\tEscolha uma opção:");
        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;
    }

    private static void soma(Calculadora n, Scanner sc){
        Calculadora calc = new Calculadora();
        System.out.print("Digite o primeiro numero: ");
        int nm1 = 0;
        try {
            nm1 = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
            System.out.println("\nDigite um número inteiro!");
            soma(calc, sc);
        }
        
        System.out.print("Digite o segundo numero: ");
        int nm2 = 0;
        boolean validador = false;

        do {
            try {
                nm2 = Integer.parseInt(sc.nextLine());
                validador = true;
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
                System.out.println("\nDigite um número inteiro!");         
            }
        } while (validador != true);

        int outro = calc.soma(nm1, nm2);
        System.out.printf("\nA soma dos números é igual a: %s ", outro);
    }

    private static void subtracao(Calculadora n, Scanner sc){
        Calculadora calc = new Calculadora();
        System.out.print("Digite o primeiro numero: ");
        int nm1 = 0;
        try {
            nm1 = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
            System.out.println("\nDigite um número inteiro!");
            soma(calc, sc);
        }
        
        System.out.print("Digite o segundo numero: ");
        int nm2 = 0;
        boolean validador = false;

        do {
            try {
                nm2 = Integer.parseInt(sc.nextLine());
                validador = true;
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
                System.out.println("\nDigite um número inteiro!");         
            }
        } while (validador != true);

        int outro = calc.subtracao(nm1, nm2);
        System.out.printf("\nA subtração dos números é igual a: %s ", outro);
    }

    private static void multiplicacao(Calculadora n, Scanner sc){
        Calculadora calc = new Calculadora();
        System.out.print("Digite o primeiro numero: ");
        int nm1 = 0;
        try {
            nm1 = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
            System.out.println("\nDigite um número inteiro!");
            soma(calc, sc);
        }
        
        System.out.print("Digite o segundo numero: ");
        int nm2 = 0;
        boolean validador = false;

        do {
            try {
                nm2 = Integer.parseInt(sc.nextLine());
                validador = true;
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
                System.out.println("\nDigite um número inteiro!");         
            }
        } while (validador != true);

        int outro = calc.multiplicacao(nm1, nm2);
        System.out.printf("\nA multiplicação dos números é igual a: %s ", outro);
    }

    private static void divisao(Calculadora n, Scanner sc){
        Calculadora calc = new Calculadora();
        System.out.print("Digite o primeiro numero: ");
        int nm1 = 0;
        try {
            nm1 = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
            System.out.println("\nDigite um número inteiro!");
            soma(calc, sc);
        }
        
        System.out.print("Digite o segundo numero: ");
        int nm2 = 0;
        boolean validador = false;

        do {
            try {
                nm2 = Integer.parseInt(sc.nextLine());
                validador = true;
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
                System.out.println("\nDigite um número inteiro!");         
            }
        } while (validador != true);

        int outro = calc.divisao(nm1, nm2);
        System.out.printf("\nA divisão dos números é igual a: %s ", outro);
    }
}
