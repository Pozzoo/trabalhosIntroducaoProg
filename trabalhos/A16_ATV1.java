import java.util.Scanner;

public class A16_ATV1 {
    public static void main(String[] args) {
        //haiiii :3
        Scanner input = new Scanner(System.in);
        int[] num = new int[20];

        for (int i = 0; i < 20; i++) {
            num[i] = Integer.parseInt(input.nextLine());
        }

        float media = calcularMedia(num);
        verificarMaior(media, num);

    }
    public static float calcularMedia(int[] num){
        int soma = 0;
        for (int i = 0; i < 20; i++) {
            soma += num[i];
        }
        return soma/20f;
    }

    public static void verificarMaior(float media, int[] num){
        int maior = 0;
        for (int i = 0; i < 20; i++) {
            if (media <= num[i]){
                maior++;
            }
        }
        System.out.println("Media: " + media);
        System.out.println("Maiores ou iguais a media: " + maior);
    }
}
