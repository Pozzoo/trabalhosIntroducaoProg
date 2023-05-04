import java.util.Scanner;

public class Exemplo4 {

    public static void main(String[] args) {
        int x, y, z, a, b;
        float c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira 3 digitos");
        x = Integer.valueOf(scanner.nextLine());
        y = Integer.valueOf(scanner.nextLine());
        z = Integer.valueOf(scanner.nextLine());

        a = x+y+z;
        b = x*y*z;

        c = (float)(x+y)/2;

        System.out.println("Soma: "+a);
        System.out.println("Produto: "+b);
        System.out.println("Média: "+c);
    }

}


