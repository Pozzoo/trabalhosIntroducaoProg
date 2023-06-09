import java.util.Random;
import java.util.Scanner;

public class A18_ATV3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String[] lojas = new String[3];
        String[] produtos = new String[4];
        int[][] precos = new int[3][4];

        for (int i = 0; i < lojas.length; i++) {
            System.out.println("Digite o nome da loja " + (i + 1));
            lojas[i] = String.valueOf(input.nextLine());
        }

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Digite o nome do produto " + (i + 1));
            produtos[i] = String.valueOf(input.nextLine());
        }

        for (int i = 0; i < precos.length; i++) {
            for (int j = 0; j < precos[0].length; j++) {
                precos[i][j] = rand.nextInt(0, 200);

                if (precos[i][j] <= 120){
                    System.out.println(produtos[j] + " " + lojas[i]);
                }
            }
        }
    }
}