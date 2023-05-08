import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) {

    String nome;
    String matricula;
    char sexo;
    int idade;
    float peso;

    Scanner input = new Scanner(System.in);

    System.out.println("Qual o nome chefia");
    nome = input.nextLine();

    System.out.println("Qual seria o Sexo? (M, F, S, N)");
    sexo = input.nextLine().charAt(0);

    System.out.println("Gostaria de saber seu peso, Vossa Exelencia");
    peso = Float.valueOf(input.nextLine());

    System.out.println("Idade meu rei");
    idade = Integer.valueOf(input.nextLine());

    System.out.println("Vossa Senhoria estaria matriculada no IFSC campus Lages? (Sim, Não)");
    matricula = input.nextLine();

        System.out.println("nome: "+nome);
        System.out.println("sexo: "+sexo);
        System.out.println("peso: "+peso);
        System.out.println("idade: "+idade);
        System.out.println("está matriculado: "+matricula);





    }



}