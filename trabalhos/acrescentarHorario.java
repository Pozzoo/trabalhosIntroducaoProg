import java.util.Scanner;

public class acrescentarHorario {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a hora");
            int hora = Integer.parseInt(input.nextLine());
        System.out.println("Digite o minuto");
            int minuto = Integer.parseInt(input.nextLine());
        System.out.println("Digite o segundo");
            int segundo = Integer.parseInt(input.nextLine());

        segundo++;
        if (segundo == 60){
            minuto++;
            segundo = 0;
        }
        if (minuto == 60) {
            hora++;
            minuto = 0;
        }
        System.out.println(hora + "h " + minuto + "m " + segundo + "s");
    }
}
