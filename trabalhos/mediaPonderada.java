import java.util.Scanner;

public class mediaPonderada {

    public static void main(String[] args) {

        float n1, n2, n3, p1, p2, p3, media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a preimeira nota seguida de seu peso");

        n1 = Float.valueOf(scanner.nextLine());
        p1 = Float.valueOf(scanner.nextLine());

        System.out.println("Digite a segunda nota seguida de seu peso");

        n2 = Float.valueOf(scanner.nextLine());
        p2 = Float.valueOf(scanner.nextLine());

        System.out.println("Digite a terceira nota seguida de seu peso");

        n3 = Float.valueOf(scanner.nextLine());
        p3 = Float.valueOf(scanner.nextLine());

        media = (n1*p1 + n2*p2 + n3*p3)/(p1+p2+p3);


        System.out.println("Media: "+media);
    }

}
