import java.util.Random;
public class A18_ATV1 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] num = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = rand.nextInt(0, 20);
                System.out.print(num[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println(" ");

        int soma = calcularSoma(num);
        System.out.println("Soma total: " + soma);

        calcularSomaLinha(num);
        calcularSomaColuna(num);
        calcularMaior(num);
    }
    public static int calcularSoma(int[][] num){
        int soma = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                soma += num[i][j];
            }
        }
        return soma;
    }
    public static void calcularMaior(int[][] num){
        int maior = 0, lin = 0, col = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                if (maior < num[i][j]) {
                    maior = num[i][j];
                    lin = i;
                    col = j;
                }
            }
        }
        System.out.println("O maior elemento é: " + maior + " e está na posição: (" + lin + ", " + col + ")");
    }
    public static void calcularSomaLinha(int[][] num){
        int somaL = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                somaL += num[i][j];
            }
            System.out.println("Soma da " + (i + 1) + " linha: " + somaL);
            somaL = 0;
        }
    }
    public static void calcularSomaColuna(int[][] num){
        int somaC = 0;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 3; i++) {
                somaC += num[i][j];
            }
            System.out.println("Soma da " + (j + 1) + " coluna: " + somaC);
            somaC = 0;
        }
    }
}