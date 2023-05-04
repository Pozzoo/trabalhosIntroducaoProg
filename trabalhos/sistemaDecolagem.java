import java.util.Scanner;

public class sistemaDecolagem {

    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    float tamPista;
    int p, vis, ch, pass;
    boolean sisDeco, decolagem;

        System.out.println("Qual o tamanho da pista?");
        tamPista = Float.valueOf(scanner.nextLine());
        System.out.println("Qual o peso da areonave?");
        p = Integer.valueOf(scanner.nextLine());
        System.out.println("Qual a visibilidade da pista");
        vis = Integer.valueOf(scanner.nextLine());
        System.out.println("Qual o nivel de chuva");
        ch = Integer.valueOf(scanner.nextLine());
        System.out.println("Qantos passageiros estão abordo");
        pass = Integer.valueOf(scanner.nextLine());
        System.out.println("O avião possui sistema de decolagem?");
        sisDeco = Boolean.valueOf(scanner.nextLine());

        decolagem = (!(tamPista <= 1.5 && p > 40) && !(tamPista <= 2.0 && p > 60) || (tamPista > 2)) && (vis >= 20 || sisDeco) && !(ch > 5) && !(pass > 100 && ch > 0);

        System.out.println("O avião pode decolar: "+ decolagem);

    }
}
