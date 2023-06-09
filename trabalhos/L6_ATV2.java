/*Faça um programa que leia 10 números inteiros e armazene-os em um vetor A. Em
seguida, ele deve ler outros 10 números inteiros e armazená-los em um vetor B. Por fim, o
programa deve gerar e apresentar o vetor C, com 20 posições. Este vetor vai armazenar
os valores de A e B intercalados, ou seja, na primeira posição de C deve ser armazenado
o primeiro elemento de A, na segunda posição de C deve-se armazenar o primeiro
elemento de B, na terceira posição de C deve-se armazenar o segundo elemento de A e
assim por diante. O programa deve possuir uma função que fará a leitura de cada um dos
vetores (um vetor por vez), uma função para calcular e retornar o vetor C e, por fim, uma
função para apresentar o vetor C.*/

import java.util.Random;
public class L6_ATV2 {
    public static Random rand = new Random();
    public static void main(String[] args) {

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];

        pegarDados(a, b);
        calcularC(a, b, c);
        printarC(c);

    }
    public static void pegarDados(int[] a, int[] b){
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(0, 20);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = rand.nextInt(0, 20);
        }
    }
    public static void calcularC(int[] a, int[] b, int[] c){
        for (int i = 0; i < c.length; i+=2) {
            c[i] = a[i/2];
        }
        for (int i = 1; i < c.length; i+=2) {
            c[i] = b[i/2];
        }
    }
    public static void printarC(int[] c){
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}