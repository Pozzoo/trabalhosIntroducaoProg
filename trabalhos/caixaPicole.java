import java.util.Scanner;

public class caixaPicole {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        float e1, e2, e3, r1, r2, r3, r4;

        System.out.println("Insira a quantidade de Picolés tipo 1 vendida");
            e1 = Float.valueOf(scanner.nextLine());
        System.out.println("Insira a quantidade de Picolés tipo 2 vendida");
            e2 = Float.valueOf(scanner.nextLine());
        System.out.println("Insira a quantidade de Picolés tipo 3 vendida");
            e3 = Float.valueOf(scanner.nextLine());

        r1 = e1 * 1.50f;
        r2 = e2 * 2.00f;
        r3 = e3 * 0.75f;
        r4 = r1 + r2 + r3;

        System.out.println("Total de Picolés tipo 1 vendidos: "+ r1);
        System.out.println("Total de Picolés tipo 2 vendidos: "+ r2);
        System.out.println("Total de Picolés tipo 3 vendidos: "+ r3);
        System.out.println("Total de Picolés vendidos: "+ r4);


    }
}
