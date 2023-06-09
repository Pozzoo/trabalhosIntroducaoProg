import java.util.Scanner;

public class A16_ATV4 {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("Digite o numero de passageiros");
        int passageiros = Integer.parseInt(input.nextLine());
        System.out.println("------------------------------");

        String[] nomes = new String[passageiros];
        char[] destinos = new char[passageiros];

        lerDados(passageiros, nomes, destinos);
        printar(passageiros, nomes, destinos, 'A');
        printar(passageiros, nomes, destinos, 'B');
        printar(passageiros, nomes, destinos, 'C');
        printar(passageiros, nomes, destinos, 'D');
        printar(passageiros, nomes, destinos, 'E');
    }
    public static void lerDados(int passageiros, String[] nomes, char[] destinos){
        for (int i = 0; i < passageiros; i++) {
            System.out.println("Digite o nome do " + (i + 1) + " passageiro");
            nomes[i] = String.valueOf(input.nextLine());
            System.out.println("Digite o destino do " + (i + 1) + " passageiro");
            destinos[i] = String.valueOf(input.nextLine()).charAt(0);
            System.out.println("----------------------------------------");
        }
    }
    public static void printar(int passageiros, String[] nome, char[] destinos, char cidades){
        System.out.println("\n" + "Passageiros que vão para a cidade " + cidades + ":");
        for (int i = 0; i < passageiros; i++) {
            if (destinos[i] == cidades) {
                System.out.print(nome[i] + ". ");
            }
        }
    }
}