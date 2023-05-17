import java.util.Scanner;

public class P2_Q2 {

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidade = conferirQuantTermos();
        lerOsTermos(quantidade);
    }

    public static int conferirQuantTermos() {
        int quantTer = 0;
        do {
            System.out.println("Digite a quantidade de termos que a série ira gerar");
            int termos = Integer.parseInt(input.nextLine());
            if (termos >= 3 && termos <= 100) {
                quantTer = termos;
            } else {
                quantTer = 0;
                System.out.println("Valor invalido, a quantidade de termos deve ser entre 3 e 100");
                System.out.println("-------------------------------------------------------------");
            }
        } while (quantTer == 0);
        return quantTer;
    }
    public static void lerOsTermos(int quant){
        int termo1 = -1;
        int termo2 = -1;
        for (;;){
            System.out.println("Digite o primeiro termo");
            termo1 = Integer.parseInt(input.nextLine());
            if (termo1 >=0 ){
                break;
            } else {
                System.out.println("Valor invalido, o primeiro termo deve ser maior ou igual a zero");
                System.out.println("---------------------------------------------------------------");
            }
        }
        for (;;){
            System.out.println("Digite o segundo termo");
            termo2 = Integer.parseInt(input.nextLine());
            if (termo2 > termo1){
                break;
            } else {
                System.out.println("Valor invalido, o segundo termo deve ser maior que o primeiro");
                System.out.println("-------------------------------------------------------------");
            }
        }
        gerarSerie(quant, termo1, termo2);
    }
    public static void gerarSerie(int quant, int termo1, int termo2){
        System.out.println("---");
        System.out.println(termo1);
        System.out.println(termo2);
        int termo3;
        for (int i = 3; i <= quant; i++){

            if (i % 2 != 0){
                termo3 = termo2 + termo1;
            } else {
                termo3 = termo2 - termo1;
            }
            System.out.println(termo3);

            termo1 = termo2;
            termo2 = termo3;
        }
    }
}