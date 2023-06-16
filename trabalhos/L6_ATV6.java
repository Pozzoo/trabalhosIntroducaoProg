import java.util.Random;
import java.util.Scanner;

/*Realizou-se uma pesquisa com um conjunto de pessoas, na qual obteve-se os
seguintes dados:
- Idade;
- Valor do salário;
- Grau de instrução registrado como um código (1 – Fundamental; 2 – Médio; 3 –
Superior).
Faça um programa que leia os dados das várias pessoas entrevistadas, calcule e
apresente:
a) Quantidade de pessoas com ensino superior que ganham menos de R$ 2.000,00;
b) A média salarial das pessoas conforme seu grau de instrução;
c) A idade média das pessoas com ensino superior;*/
public class L6_ATV6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Digite o numero de pessoas intrevistadas");
        int pessoas = Integer.parseInt(input.nextLine());

        int[] idade = new int[pessoas];
        int[] salario = new int[pessoas];
        int[] grauInst = new int[pessoas];
        int menos2k = 0, salF = 0, salM = 0, salS = 0, f = 0, m = 0, s = 0, idadeM = 0;

        for (int i = 0; i < pessoas; i++) {
            idade[i] = rand.nextInt(10, 50);
            salario[i] = rand.nextInt(100, 20000);
            grauInst[i] = rand.nextInt(1, 4);

            if (grauInst[i] == 3 && salario[i] < 2000){
                menos2k++;
            }
            switch (grauInst[i]){
                case 1:
                    salF += salario[i];
                    f++;
                    break;
                case 2:
                    salM += salario[i];
                    m++;
                    break;
                case 3:
                    salS += salario[i];
                    s++;
                    idadeM += idade[i];
                    break;
            }
        }

        System.out.println("Quantidade de pessoas com ensino superior que ganham menos de R$ 2.000,00: " + menos2k);
        System.out.println("Media salario EF: " + (salF/f));
        System.out.println("Media salario EM: " + (salM/m));
        System.out.println("Media salario SG: " + (salS/s));
        System.out.println("Idade media ensino superior: " + (idadeM/s));
    }
}
