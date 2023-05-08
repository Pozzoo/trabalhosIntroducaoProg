import java.util.Scanner;

public class L5_ATV12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float a = 0;
        System.out.println("Digite o numero de operação a serem feitas");
        int n = Integer.parseInt(input.nextLine());
        
        for (int i = 1; i <= n; i++){
            a += (float) 1 / i;
        }
        System.out.println("A = " + a);
    }
}
