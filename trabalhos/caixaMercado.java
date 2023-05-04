import java.util.Scanner;

public class caixaMercado {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int qC, lL, bB;
        float cC, cL, cB, tT, cafe, leite, bolacha;

        System.out.println("Informe o peso do Café");
        qC = Integer.valueOf(scanner.nextLine());
        System.out.println("Informe o valor do Café");
        cC = Float.valueOf(scanner.nextLine());
        System.out.println("Informe a quantidade de Litros de Leite");
        lL = Integer.valueOf(scanner.nextLine());
        System.out.println("Informe o valor do Leite");
        cL = Float.valueOf(scanner.nextLine());
        System.out.println("Informe a quantidade de Bolachas");
        bB = Integer.valueOf(scanner.nextLine());
        System.out.println("Informe o valor das Bolachas");
        cB = Float.valueOf(scanner.nextLine());

        cafe = qC * cC;
        leite = lL * cL;
        bolacha = bB * cB;
        tT = cafe + leite + bolacha;

        System.out.println("Total Cafe: R$"+ cafe);
        System.out.println("Total Leite: R$"+ leite);
        System.out.println("Total Bolacha: R$"+ bolacha);
        System.out.println("Total: R$"+ tT);

            }

}


