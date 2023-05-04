import java.util.Scanner;

public class conversorImperial {

    public static void main(String[] args) {

        double p, po, ja, mi;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor em Pés");
        p = Double.valueOf(scanner.nextLine());

        po = p*12;
        ja = p/3;
        mi = ja/1760;

        System.out.println("Polegadas: "+ po);
        System.out.println("Jardas: "+ ja);
        System.out.println("Milhas: "+ mi);

    }

}
