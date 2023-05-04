import java.util.Scanner;

public class calculadoraPeso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua altura");
            float h = Float.parseFloat(input.nextLine());
        System.out.println("""
                [M] - Masculino
                [F] - Feminino
                Digite o seu gênero -->""");
            char genero = String.valueOf(input.nextLine()).charAt(0);
        switch (genero){
            case 'M':
                System.out.println("Seu peso ideal é: " + (72.2 * h -58));
            case 'F':
                System.out.println("Seu peso ideal é: " + (62.1 * h -44.7));
        }
    }
}