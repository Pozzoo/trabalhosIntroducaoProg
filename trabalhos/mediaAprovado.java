import java.util.Scanner;

public class mediaAprovado {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        float   n1, n2, n3, m, f;
        boolean aprovado, atestado;

        System.out.println("Digite o valor da primeira nota");
        n1 = Float.valueOf(scanner.nextLine());
        System.out.println("Digite o valor da segunda nota");
        n2 = Float.valueOf(scanner.nextLine());
        System.out.println("Digite o valor da terceira nota");
        n3 = Float.valueOf(scanner.nextLine());
        System.out.println("Digite o numero de faltas do aluno");
        f = Float.valueOf(scanner.nextLine());
        System.out.println("O aluno possui atestado?");
        atestado = Boolean.valueOf(scanner.nextLine());

        m = (n1 + n2 + n3) / 3;
        aprovado = (m >=6) && ((atestado) || (f <= 25));

        System.out.println("O aluno esta aprovado: "+ aprovado);



    }
}
