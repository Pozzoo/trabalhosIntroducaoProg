import java.util.Scanner;

public class atualizadorPrecos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o preço antigo do produto");
            float pAntigo = Float.parseFloat(input.nextLine());
        System.out.println("Digite o novo preço do produto");
            float pNovo = Float.parseFloat(input.nextLine());

        float acrescimo = percentual(pAntigo, pNovo);

        boolean acrValido = fAcrescimo(pAntigo, pNovo);

        if (acrValido){
            System.out.println("O produto teve um acrescimo de: " + acrescimo + "%");
        }
    }
    public static float percentual(float pA, float pN){
        float acrescimo1;

        acrescimo1 = ((pN*100)/pA)-100;
        return acrescimo1;
    }
    public static boolean fAcrescimo(float pA, float pN){
        if (pA > pN){
            System.out.println("Erro, preço antigo maior que o novo");
        } else {
            return true;
        }
        return false;
    }
}


