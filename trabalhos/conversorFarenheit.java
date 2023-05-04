import java.util.Scanner;

public class conversorFarenheit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float c1, f1;

        System.out.println("Digite a temperatura em celcius");
        c1 = Float.valueOf(scanner.nextLine());

        f1 = ((9.0f/5.0f)*c1) + 32;

        System.out.println("A temperatura em farenheight é: "+ f1);
    }
}
