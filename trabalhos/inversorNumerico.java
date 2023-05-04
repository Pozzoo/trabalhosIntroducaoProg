import java.util.Scanner;

public class inversorNumerico {

    public static void main(String[] args) {

        int e1, r1 ,r2 ,r3 ,r4;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero CDU");

        e1 = Integer.valueOf(scanner.nextLine());

        r1 = e1/100;
        r2 = (e1/10)-(r1*10);
        r3 = (e1-(r1*100)) - (r2 * 10);

        r4 = r3*100 + r2*10 + r1;

        System.out.print("Resultado: "+ r4);

    }
}
