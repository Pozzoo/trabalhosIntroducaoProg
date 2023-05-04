import java.util.Scanner;

public class sensorAlarme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean s1, s2, s3, s4, s5, s6, alarme;

        System.out.println("Sensor 1:");
                s1 = Boolean.valueOf(scanner.nextLine());
        System.out.println("Sensor 2:");
                s2 = Boolean.valueOf(scanner.nextLine());
        System.out.println("Sensor 3:");
                s3 = Boolean.valueOf(scanner.nextLine());
        System.out.println("Sensor 4:");
                s4 = Boolean.valueOf(scanner.nextLine());
        System.out.println("Sensor 5:");
                s5 = Boolean.valueOf(scanner.nextLine());
        System.out.println("Sensor 6:");
                s6 = Boolean.valueOf(scanner.nextLine());

                alarme = s2 || s3 || s4 || !(s1 && s5 && s6);

        System.out.println("Alarme ligado: "+ alarme);
    }
}
