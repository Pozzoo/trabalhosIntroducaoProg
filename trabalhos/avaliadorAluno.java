import java.util.Scanner;

public class avaliadorAluno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float p1, p2, t;
        int f;
        boolean aprovado;

        System.out.println("Digite a nota da primeira prova");
        p1 = Float.valueOf(scanner.nextLine());
        System.out.println("Digite a nota da segunda prova");
        p2 = Float.valueOf(scanner.nextLine());
        System.out.println("Digite a nota do trabalho");
        t = Float.valueOf(scanner.nextLine());
        System.out.println("Digite a frequencia do aluno");
        f = Integer.valueOf(scanner.nextLine());

        aprovado = (t >= 7 || (t == 6 && f >= 90)) && (p1 >= 6 || p2 >= 6) && (f >= 75);

        if (aprovado){
            System.out.println("Parabéns, você foi aprovado");
        } else {
            System.out.println("Infelizmente você não foi aprovado");
        }
    }
}
