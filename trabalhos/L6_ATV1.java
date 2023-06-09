/*Faça um programa que leia 10 números inteiros e armazene-os em um vetor A. Em
seguida, ele deve ler outros 10 números inteiros e armazená-los em um vetor B. Por fim, o
programa deve gerar e apresentar o vetor C, também com 10 posições, que armazenará
a soma dos valores armazenados nas posições correspondentes de A e B. O programa
deve possuir uma função que fará a leitura de cada um dos vetores (um vetor por vez),
uma função para calcular e retornar o vetor C e, por fim, uma função para apresentar o
vetor C. */

import java.util.Random;
public class L6_ATV1 {
    public static Random rand = new Random();
    public static void main(String[] args) {

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

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
      for (int i = 0; i < c.length; i++) {
          c[i] = (a[i] * b[i]);
      }
  }
  public static void printarC(int[] c){
      for (int i = 0; i < c.length; i++) {
          System.out.print(c[i] + " ");
      }
  }
}
