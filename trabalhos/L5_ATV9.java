import java.util.Scanner;

public class L5_ATV9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, maior = 0, menor = 0;

        System.out.println("Digite um numero, ou digite 0 para finalizar");
        num = Integer.parseInt(input.nextLine());
        maior = num;
        menor = num;

        do {
            if (num != 0) {
                if (num >= maior) {
                    maior = num;
                } else if (num <= menor) {
                    menor = num;
                }

                System.out.println("Digite um numero, ou digite 0 para finalizar");
                num = Integer.parseInt(input.nextLine());
            }
        } while (num != 0);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
