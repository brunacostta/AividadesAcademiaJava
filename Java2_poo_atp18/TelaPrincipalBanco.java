package Java2_poo_atp18;

public class TelaPrincipalBanco {

    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();

        cc1.setCodigo_cliente(20);
        System.out.printf("\nO código do cliente é: %d ", cc1.getCodigo_cliente());

        cc1.setAgencia("Ilhabela");
        System.out.printf("\nA agência do cliente fica em: %s ", cc1.getAgencia());

        cc1.setNumero(1204);
        System.out.printf("\nO número da agência é: %d ", cc1.getNumero());

        cc1.setSaldo(9623.81);
        System.out.printf("\nO saldo do cliente é de: R$ %.2f ", cc1.getSaldo());
    }
    
}
