import java.util.Scanner;

public class calculadorRaiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero");
        int num1 = Integer.parseInt(input.nextLine());
        boolean img = raiz(num1);

        if (img){
            System.out.println("Imaginario");
        }

    }
    public static boolean raiz(float num1){
        if (num1 >= 0){
            System.out.println(Math.sqrt(num1));
            return false;
        }
        return true;
    }
}
