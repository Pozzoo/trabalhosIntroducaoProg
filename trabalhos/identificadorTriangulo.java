import java.util.Scanner;

public class identificadorTriangulo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do lado X");
            int x = Integer.parseInt(input.nextLine());
        System.out.println("Digite o valor do lado Y");
            int y = Integer.parseInt(input.nextLine());
        System.out.println("Digite o valor do lado Z");
            int z = Integer.parseInt(input.nextLine());

        if (x + y < z || x + z < y || z + y < x){
            System.out.println("Não é um triangulo");
        } else if (x == y && y == z) {
            System.out.println("O triangulo é Equilátero");
        } else if (x == y || x == z || y == z) {
            System.out.println("O triangulo é Isosceles");
        } else {
            System.out.println("O triangulo é Escaleno");
        }
    }
}
