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
        int nm1 = calc.n1 = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o segundo numero: ");
        int nm2 = calc.n2 = Integer.parseInt(sc.nextLine());
        int vlr_final = calc.soma(nm1, nm2);
        System.out.printf("\nA soma dos números é igual a: %s ", vlr_final);
    }

    private static void subtracao(Calculadora n, Scanner sc){
        Calculadora calc = new Calculadora();
        System.out.print("Digite o primeiro numero: ");
        int nm1 = calc.n1 = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o segundo numero: ");
        int nm2 = calc.n2 = Integer.parseInt(sc.nextLine());
        int vlr_final = calc.subtracao(nm1, nm2);
        System.out.printf("\nA subtração dos números é igual a: %s ", vlr_final);
    }

    private static void multiplicacao(Calculadora n, Scanner sc){
        Calculadora calc = new Calculadora();
        System.out.print("Digite o primeiro numero: ");
        int nm1 = calc.n1 = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o segundo numero: ");
        int nm2 = calc.n2 = Integer.parseInt(sc.nextLine());
        int vlr_final = calc.multiplicacao(nm1, nm2);
        System.out.printf("\nA multiplicação dos números é igual a: %s ", vlr_final);
    }

    private static void divisao(Calculadora n, Scanner sc){
        Calculadora calc = new Calculadora();
        System.out.print("Digite o primeiro numero: ");
        int nm1 = calc.n1 = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o segundo numero: ");
        int nm2 = calc.n2 = Integer.parseInt(sc.nextLine());
        int vlr_final = calc.divisao(nm1, nm2);
        System.out.printf("\nA soma dos números é igual a: %s ", vlr_final);
    }
}
