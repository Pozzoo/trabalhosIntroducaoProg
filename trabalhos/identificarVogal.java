import java.util.Scanner;

public class identificarVogal {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite uma letra");
        char letra = input.nextLine().toUpperCase().charAt(0);

        int vogal = verificarVogal(letra);

        if (vogal == 1){
            System.out.println(letra + " é uma vogal");
        } else {
            System.out.println(letra + " é uma consoante");
        }
    }
    public static int verificarVogal(char letra){

        switch (letra){
            case 'A', 'E', 'I', 'O', 'U':
                return 1;
        }
        return 0;
    }
}
