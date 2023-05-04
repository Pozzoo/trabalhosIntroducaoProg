import java.util.Scanner;

public class estoque {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro produto");
            String nome1 = String.valueOf(input.nextLine());
        System.out.println("Digite a quantidade do primeiro produto");
            int quant1 = Integer.parseInt(input.nextLine());
        System.out.println("Digite o nome do segundo produto");
            String nome2 = String.valueOf(input.nextLine());
        System.out.println("Digite a quantidade do segundo produto");
            int quant2 = Integer.parseInt(input.nextLine());
        System.out.println("Digite o nome do terceiro produto");
            String nome3 = String.valueOf(input.nextLine());
        System.out.println("Digite a quantidade do terceiro produto");
            int quant3 = Integer.parseInt(input.nextLine());

        if (quant1 < 30){
            System.out.println("O estoque de " + nome1 + " está baixo");
        } if (quant2 < 30){
            System.out.println("O estoque de " + nome2 + " está baixo");
        } if (quant3 < 30){
            System.out.println("O estoque de " + nome3 + " está baixo");
        }
    }
}
