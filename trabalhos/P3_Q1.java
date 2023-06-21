import java.util.Scanner;

public class P3_Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tam = 0;
        do {
            System.out.println("Digite o numero de linhas/colunas que a matriz terá");
            tam = Integer.parseInt(input.nextLine());

            if(tam < 2){
                System.out.println("Tamanho invalido, digite um valor maior que 2");
            }
        } while (tam < 2);

        int[][] matrizA = new int[tam][tam];
        int[][] matrizB = new int[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.println("Digite o valor da posição " + i + ", " + j);
                matrizA[i][j] = Integer.parseInt(input.nextLine());
                matrizB[(tam - 1) - i][j] = matrizA[i][j];
            }
        }

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
