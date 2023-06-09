import java.util.Scanner;

public class A16_ATV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tamanho = Integer.parseInt(input.nextLine());

        int[] num = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            num[i] = Integer.parseInt(input.nextLine());
        }

        subistituir(num, tamanho);

        printar(num, tamanho);

    }
    public static void printar(int[] num, int tamanho){
        for (int i = 0; i < tamanho; i++) {
            System.out.println(num[i]);
        }
    }
    public static void subistituir(int[] num, int tamanho){
        int subst = 0;
        for (int i = 0; i < tamanho; i++) {
            if (num[i] < 0) {
                num[i] = 0;
                subst++;
            }
        }
        printar(num, tamanho);
        System.out.println("Substituidos: " + subst);
    }
}