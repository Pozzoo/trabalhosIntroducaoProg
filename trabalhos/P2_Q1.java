import java.util.Scanner;

public class P2_Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero de fitas no acervo");
        int nFitas = Integer.parseInt(input.nextLine());
        System.out.println("Digite o valor da locação de uma fita");
        float pLocac = Float.parseFloat(input.nextLine());
        System.out.println("Digite o preço de uma fita nova");
        float pFita = Float.parseFloat(input.nextLine());

        float receitaA = calcularReceita(nFitas, pLocac);
        int fitasE = calcularFitasEstragadas(nFitas);
        float gastoR = calcularReposicao(fitasE, pFita);
        float lucroA = calcularLucro(receitaA, gastoR);

        printarValores(fitasE, receitaA, gastoR, lucroA);

    }
    public static float calcularReceita(int qAcervo, float vLocacao){
        float umaLocac = (qAcervo * 0.2f);
        float duasLocac = (qAcervo * 0.1f);
        float tresLocac = (qAcervo * 0.15f);
        float quatroLocac = (qAcervo * 0.25f);
        float cincoLocacao = (qAcervo * 0.3f);

        float locacT = umaLocac + (duasLocac * 2) + (tresLocac * 3) + (quatroLocac * 4) + (cincoLocacao * 5);
        float receita = locacT * 12 * vLocacao;
        return receita;
    }
    public static int calcularFitasEstragadas(int qAcervo){
        int fitasEstraga = (int) Math.floor((qAcervo * 0.03));
        return fitasEstraga;
    }
    public static float calcularReposicao(int fitasEstr, float valorFita){
        float fitasR = (fitasEstr / 2f) * valorFita;
        return fitasR;
    }
    public static float calcularLucro(float receita, double despesa){
        float lucro = (float) (receita - ((despesa) + 2500 * 12));
        return lucro;
    }
    public static void printarValores(int fitasE, float receitaA, float gastoR, float lucroA){
        System.out.println("Receita anual: " + receitaA);
        System.out.println("Fitas estragadas: " + fitasE);
        System.out.println("Gasto reposição: " + gastoR);
        System.out.println("Lucro anual: " + lucroA);

        if (lucroA >= 36000){
            System.out.println("Lucro Alto");
        } else if (lucroA < 0) {
            System.out.println("prejuízo");
        } else {
            System.out.println("Lucro Baixo");
        }
    }
}