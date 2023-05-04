import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float valor = 0;

        System.out.println("Digite o número da conta");
            String numeroC = String.valueOf(input.nextLine());
        System.out.println("Digite o saldo atual da conta");
            float saldoA = Float.parseFloat(input.nextLine());
        System.out.print("""
                [1] - Depositar
                [2] - Sacar
                Digite a operação que deseja fazer -->  """);
            int operacao = Integer.parseInt(input.nextLine());

        if (operacao == 1){
            System.out.println("Digite o valor a ser depositado");
            valor = Float.parseFloat(input.nextLine());
        } else if (operacao == 2){
            System.out.println("Digite o valor a ser sacado");
            valor = -(Float.parseFloat(input.nextLine()));
        } else {
            System.out.println("Operação Invalida");
        }
        System.out.println("Novo Saldo: " + (saldoA + valor));
        if ((saldoA + valor) < 0){
            System.out.println("Conta estourada");
        }
    }
}
