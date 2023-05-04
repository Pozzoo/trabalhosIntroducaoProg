import java.util.Scanner;

public class diferencaNumeros {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
            int n1 = Integer.parseInt(input.nextLine());
        System.out.println("Digite o segundo numero");
            int n2 = Integer.parseInt(input.nextLine());

        int n3 = (n1 - n2);

        if (n3 < 0){
            n3 = n3 - (2*n3);
        }
        System.out.println(n3);
    }
}
