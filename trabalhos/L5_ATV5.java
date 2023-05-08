import java.util.Scanner;

public class L5_ATV5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menorDeIdade = 0, countIdade = 0, countAltura = 0;
        float idadeMedia = 0, alturaMedia = 0;

        for (int i = 1; i <= 5; i++){
            System.out.println("Digite a idade do " + i + "º aluno");
                int idade = Integer.parseInt(input.nextLine());

            System.out.println("Digite a idade do " + i + "º aluno");
                float altura = Float.parseFloat(input.nextLine());

            if (altura > 1.70f){
                idadeMedia += idade;
                countAltura++;
            }
            if (idade < 18){
                menorDeIdade++;
            } else if (idade > 20) {
                alturaMedia += altura;
                countIdade++;
            }
        }
        System.out.println("Quantidade de alunos com menos de 18 anos: " + menorDeIdade);
        System.out.println("Idade media dos alunos com menos de 1,70: " + (idadeMedia/countAltura));
        System.out.println("Altura media dos alunos com mais de 20 anos: " + alturaMedia/countIdade);
    }
}
