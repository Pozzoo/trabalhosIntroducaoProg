import java.util.Random;
public class A18_ATV2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] plan = new int[4][3];
        int consumo = 0, consumoF = 0, consumoM = 0, maior = 0, mes = 0, filial = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                plan[i][j] = rand.nextInt(0, 20);
                System.out.print(plan[i][j] + " ");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                consumo += plan[i][j];
                consumoM += plan[i][j];

                if (maior < plan[i][j]){
                    maior = plan[i][j];
                    mes = i + 1;
                    filial = j + 1;
                }
            }
            System.out.println("Consumo do mês " + (i + 1) + ": " + consumoM);
            consumoM = 0;
        }

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 4; i++) {
                consumoF += plan[i][j];
            }
            System.out.println("Consumo filial " + (j + 1) + ": " + consumoF);
            consumoF = 0;
        }
        System.out.println("Consumo total: " + consumo);
        System.out.println("Maior consumo: " + maior + ", Mês: " + mes + ", Filial: " + filial);
    }
}