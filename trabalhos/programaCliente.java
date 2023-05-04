import java.util.Scanner;

public class programaCliente {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int interf, relatorioS, relatorioE, casoA, casoB, casoC, tempoCaso = 0;
        int cadastroBasico;
        float tempoTotal, salarioA = 0, salarioP = 0, tempoTotal2 = 0;

        System.out.println("Qual será o tipo de interface utilizado?\n" +
                "1 - Desktop\n" +
                "2 - Web\n" +
                "3 - Mobile");
        interf = Integer.valueOf(input.nextLine());
        System.out.println("Quantos relatórios simples serão necessários?");
            relatorioS = Integer.valueOf(input.nextLine());
        System.out.println("Quantos relatórios elaborados serão necessários?");
            relatorioE = Integer.valueOf(input.nextLine());
        System.out.println("Quantos cadastros básicos serão necessários?");
            cadastroBasico = Integer.valueOf(input.nextLine());
        System.out.println("Quantos casos A serão necessários");
            casoA = Integer.valueOf(input.nextLine());
        System.out.println("Quantos casos B serão necessários");
            casoB = Integer.valueOf(input.nextLine());
        System.out.println("Quantos casos C serão necessários");
            casoC = Integer.valueOf(input.nextLine());

        tempoCaso = (casoA * 8) + (casoB * 16) + (casoC * 24);
        tempoTotal = tempoCaso + (relatorioS * 0.5f) + relatorioE + (cadastroBasico * 4);

        switch (interf){
            case 1:
                tempoTotal2 = tempoTotal;
                break;
            case 2:
                tempoTotal2 = tempoTotal * 1.15f;
                break;
            case 3:
                tempoTotal2 = tempoTotal * 1.2f;
                break;
            default:
                System.out.println("Tipo de interface invalida!");
        }
        System.out.println("Tempo total:" + tempoTotal2 + " horas");
        System.out.println("Gastos com programador: "+ tempoTotal2*50);
        System.out.println("Gastos com analista: " + tempoTotal2*80*0.2);
        System.out.println("Gasto total: " + (tempoTotal2*80*0.2 + tempoTotal2*50));
    }
}