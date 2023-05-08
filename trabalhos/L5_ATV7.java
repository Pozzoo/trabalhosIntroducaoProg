import java.util.Scanner;

public class L5_ATV7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num, somaTotal = 0, count = 0;

        do {
            System.out.println("Digite um numero ou digite 0 para encerrar");
            num = Integer.parseInt(input.nextLine());

            if (num < 0){
                System.out.println("NUMERO INVALIDO, digite um numero positivo");
            } else {
                somaTotal += num;
                count++;
            }
        } while (num != 0);

        System.out.println("Soma total: " + somaTotal);
        System.out.println("Média: " + somaTotal/count);
    }
}