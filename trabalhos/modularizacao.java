import java.util.Scanner;

public class modularizacao {
    public static void main(String[] args) {
        int d = 0;

        int a = inputNumero(1);
        int b = inputNumero(2);

        parImpar(a, b);
    }
    public static int inputNumero(int n){
        Scanner input = new Scanner(System.in);
            System.out.println("Digite o " + n + "º numero" );
            return Integer.parseInt(input.nextLine());
    }

    public static void parImpar(int x, int y) {

        int z = 0, c = 0;
        for (int i = 0; i < 2; i++){
            if (x % 2 == 0 && y % 2 == 0) {
                z = x + y;
            } else if (x % 2 != 0 && y % 2 != 0) {
                z = x - y;
            } else {
                z = x * y;
            }
            if (c == 0){
                System.out.println("C = " + z);
            } else {
                System.out.println("D = " + z);
            }
            y = z;
            c++;
        }
    }
}