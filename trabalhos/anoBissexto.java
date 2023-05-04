import java.util.Scanner;

public class anoBissexto {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int ano;
        boolean bissexto;

        System.out.println("Digite o ano");
        ano = Integer.valueOf(scanner.nextLine());

        bissexto = (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0);

        System.out.println(bissexto);
    }

}
