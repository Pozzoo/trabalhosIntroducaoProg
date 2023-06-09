/*Faça um programa que leia um vetor A (20) e troque o 1o elemento com o último, o 2o
com o penúltimo etc. até o 9o com o 10o. Por fim, o programa deve imprimir os dados do
vetor na nova ordem. Observe que não basta imprimir o vetor na ordem inversa, os
valores devem ser trocados de posição dentro do vetor. Além disto, não se deve usar um
segundo vetor, todo o processo deve ser feito utilizando um único vetor. O programa deve
ter uma única função que fará a troca dos elementos de posição.*/

import java.util.Random;

public class L6_ATV3 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] A = new int[20];

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(0, 50);
            System.out.print(A[i] + " ");
        }
        System.out.print("\n");

        inverterVetor(A);

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }
    public static void inverterVetor(int[] A){
        int aux;
        for (int i = 0; i < (A.length /2); i++) {
            aux = A[(A.length - i) - 1];
            A[(A.length - i) - 1] = A[i];
            A[i] = aux;
        }
    }
}