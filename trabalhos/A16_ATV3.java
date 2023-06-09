import java.util.Scanner;

public class A16_ATV3 {
    public static final Scanner input = new Scanner(System.in);
    //haiiii :3
    public static void main(String[] args) {

        char cont = 's';

        char[] gabarito = new char[5];
        char[] resposta = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o gabarito da " + (i + 1) + " questão");
            gabarito[i] = String.valueOf(input.nextLine()).charAt(0);
        }

        while (cont == 's'){
            String nome = lerInput(resposta);
            int acertos = verificarAcertos(gabarito, resposta);
            System.out.println(nome + " acertou " + acertos + " questões" );

            System.out.println("Continuar? (sim/não)");
            cont = String.valueOf(input.nextLine()).charAt(0);
        }
    }
    public static String lerInput(char[] resposta){
        System.out.println("Digite o nome do aluno");
        String nome = String.valueOf(input.nextLine());

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a resposta da " +  (i + 1) + " questão");
            resposta[i] = String.valueOf(input.nextLine()).charAt(0);
        }
        return nome;
    }
    public static int verificarAcertos(char[] gabarito, char[] resposta){
        int acertos = 0;
        for (int i = 0; i < 5; i++) {
            if (gabarito[i] == resposta[i]){
                acertos++;
            }
        }
        return acertos;
    }
}
