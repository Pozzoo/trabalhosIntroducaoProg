import java.util.Scanner;

public class L5_ATV04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= 10; i++){
            System.out.println(num + "x" + i + " = " + (num*i));
        }
    }
}
