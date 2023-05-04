import java.util.Scanner;

public class consumoEnergetico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float preco, conta, atraso;
        int quilowatt;

        System.out.println("Insira o preço do quilowatt");
        preco = Float.valueOf(scanner.nextLine());
        System.out.println("Insira a quantidade de energia gasta");
        quilowatt = Integer.valueOf(scanner.nextLine());

        conta = preco * quilowatt;
        atraso = (conta * 0.1f) + conta;

        if (quilowatt > 70){
            System.out.println("Consumo elevado de energia");
        } else {
            System.out.println("Você é um consumidor consciente");
        }
        System.out.println("Valor conta " + conta);
        System.out.println("Valor com atraso: " + atraso);
    }
}
