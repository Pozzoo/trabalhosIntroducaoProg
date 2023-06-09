import java.util.Random;

public class A18_ATV4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(0, 10);
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i > j){
                    System.out.print(matriz[i][j] + "  ");
                }
            }
            System.out.print("\n");
        }
    }
}