import java.util.Scanner;

public class calculadorGorjeta {

    public static void main(String[] args) {

        double e1, r1, t1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor das despesas");
        e1 = Double.valueOf(scanner.nextLine());

        r1 = e1 * 0.1;
        t1 = r1+e1;

        System.out.println("Gorjeta: "+r1);
        System.out.println("Total: "+t1);
    }
}
