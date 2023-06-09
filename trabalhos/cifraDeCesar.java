import java.util.Scanner;

public class cifraDeCesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'n', 'm', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        System.out.println("Digite a key de criptografia");
        int key = Integer.parseInt(input.nextLine());

        System.out.println("Digite a mensagem a ser criptografada");
        String mensagem = String.valueOf(input.nextLine()).toLowerCase();

        int[] cifra = new int[mensagem.length()];
        char[] cript = new char[mensagem.length()];

        for (int i = 0; i < mensagem.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (mensagem.charAt(i) == alfabeto[j]){
                    cifra[i] = j;
                } else if (mensagem.charAt(i) == ' ') {
                    cifra[i] = -500;
                }
            }
        }
        for (int i = 0; i < mensagem.length(); i++) {
            cifra[i] += key;

            if (cifra[i] > 25){
               cifra[i] -= 26;
            }
            for (int j = 0; j < 26; j++) {
                if (cifra[i] == j){
                    cript[i] = alfabeto[j];
                }
            }
            if (cifra[i] < 0) {
                cript[i] = ' ';
            }
        }
        for (int i = 0; i < mensagem.length(); i++) {
            System.out.print(cript[i]);
        }
    }
}