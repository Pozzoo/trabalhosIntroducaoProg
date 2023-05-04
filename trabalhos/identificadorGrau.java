import java.util.Scanner;

public class identificadorGrau {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o ângulo em graus");
            float angulo = Float.parseFloat(input.nextLine());

        if (angulo == 90){
            System.out.println("O ângulo é Reto");
        } else if (angulo < 90) {
            System.out.println("O ângulo é Agudo");
        } else {
            System.out.println("O ângulo é Obtuso");
        }
    }
}
