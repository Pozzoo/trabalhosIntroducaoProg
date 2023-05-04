import java.util.Scanner;

public class areaForma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("""
                [1] - Quadrado
                [2] - Triangulo
                Digite qual a forma -->
                """);
            int forma = Integer.parseInt(input.nextLine());
        System.out.println("Digite a altura da forma");
            float altura = Float.parseFloat(input.nextLine());
        System.out.println("Digite a base da forma");
            float base = Float.parseFloat(input.nextLine());

        float area = 0;

        switch (forma) {
            case 1:
                area = base * altura;
                break;
            case 2:
                area = (base * altura)/2f;
                break;
            case default:
                System.out.println("Forma Inválida");
                break;
        }
        System.out.println("a área da figura é: " + area);
    }
}