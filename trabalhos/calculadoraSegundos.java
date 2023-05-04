import java.util.Scanner;

public class calculadoraSegundos {

    public static void main (String[] args){

        int seg, min, hrs, s;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o tempo em segundos");
        s = Integer.valueOf(scanner.nextLine());

        seg = s % 60;
        min = (s / 60) % 60;
        hrs = (s / 60) / 60;

        System.out.println("Tempo do video: "+ hrs +"h" + min + "m" + seg + "s");


    }
}
