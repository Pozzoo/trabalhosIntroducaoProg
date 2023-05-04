import java.util.Scanner;

public class vencimentoContas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int d1, d2, m1, m2, a1, a2;
        boolean vencido;

        System.out.println("Digite o dia de hoje");
        d1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Digite o mes que estamos");
        m1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Digite o ano que estamos");
        a1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Digite o dia do vencimento");
        d2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Digite o mes de vencimento");
        m2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Digite o ano de vencimento");
        a2 = Integer.valueOf(scanner.nextLine());

        vencido = (a1 > a2) || (a1 >= a2 && m1 > m2) || ((a1 >= a2 && m1 >= m2) && d1 > d2);

        System.out.println("Está vencido: " + vencido);


    }
}
