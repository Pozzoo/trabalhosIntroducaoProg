import java.util.Scanner;

public class calculadorSalario {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        double e1, e2, s1, s2, s3, s4;
        int e3;

        System.out.println("Insira o valor do Salario minimo");
        e1 = Double.valueOf(scanner.nextLine());
        System.out.println("Informe a quantidade de vendas");
        e3 = Integer.valueOf(scanner.nextLine());
        System.out.println("Informe o valor das vendas");
        e2 = Double.valueOf(scanner.nextLine());

        s1 = e1 * 2;
        s2 = e3 * 150;
        s3 = e2 * 0.05;
        s4 = s1 + s2 + s3;

        System.out.println("Valor do salario: "+ s4);
    }
}
