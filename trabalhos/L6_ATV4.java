import java.util.Random;
import java.util.Scanner;

/*Para ser aprovado no POSCOMP e ingressar em um curso de Pós-Graduação em
Computação, o aluno deve ter nota superior a média das notas de todos os candidatos
que realizaram a prova. Faça um programa que leia quantos alunos realizaram o
POSCOMP, o nome e a nota de cada um deles, e apresente a lista com o nome dos
candidatos aprovados. O programa também deve apresentar o total e o percentual de
candidatos aprovados e reprovados.*/
public class L6_ATV4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Digite o numero de alunos participantes");
        int alun = Integer.parseInt(input.nextLine());

        int[] notas = new int[alun];
        String[] nomes = new String[alun];
        float media = 0, cont = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite o nome do " + (i + 1) + "º aluno");
            nomes[i] = String.valueOf(input.nextLine());
            System.out.println("Digite a nota do " + (i + 1) + "º aluno");
            notas[i] = Integer.parseInt(input.nextLine());
            media += notas[i];
        }
        media = media/alun;

        System.out.print("Aprovados: ");

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media){
                System.out.print(nomes[i] + ", ");
                cont++;
            }
        }
        System.out.println("Percentual de aprovados: " + (cont/alun) * 100 + "%");
    }
}
