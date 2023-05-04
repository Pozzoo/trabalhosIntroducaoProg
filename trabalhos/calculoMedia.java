    import java.util.Scanner;

public class calculoMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
            float nota1 = Float.parseFloat(input.nextLine());
        System.out.println("Digite a segunda nota");
            float nota2 = Float.parseFloat(input.nextLine());
        System.out.println("Digite a terceira nota");
            float nota3 = Float.parseFloat(input.nextLine());
        System.out.println("""
                [A] - Aritimetica
                [P] - Ponderada
                [G] - Geomerica
                Selecione o tipo de média""");
            char tipoMedia = String.valueOf(input.nextLine()).charAt(0);

        double media = media(nota1, nota2, nota3, tipoMedia);
        System.out.println("A média é de: " + media);
    }
    public static double media(float n1, float n2, float n3, char tipoM){

        double mediaF = 0;

        switch (tipoM){
            case 'A':
                mediaF = (n1 + n2 + n3)/3;
                break;
            case 'P':
                mediaF = (n1 + n2*2 + n3*2)/5;
                break;
            case 'G':
                mediaF = Math.cbrt(n1*n2*n3);
                break;
        }
        return mediaF;
    }
}