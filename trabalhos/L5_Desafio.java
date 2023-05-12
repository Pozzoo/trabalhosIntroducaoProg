import java.util.Scanner;

public class L5_Desafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (;;){

            System.out.println("Digite o código, ou digite 0 para sair");
            int codigo = Integer.parseInt(input.nextLine());

            if (codigo == 0){
                System.out.println("Até a próxima");
                break;
            }

            int digito5 = codigo % 10;
            int digito4 = (codigo % 100 - digito5) / 10;
            int digito3 = (codigo % 1000 - (digito5 + digito4 * 10)) / 100;
            int digito1 = codigo / 10000;
            int digito2 = codigo / 1000 - (digito1 * 10);

            int cod1 = digito1 * 6;
            int cod2 = digito2 * 5;
            int cod3 = digito3 * 4;
            int cod4 = digito4 * 3;
            int cod5 = digito5 * 2;

            int resto = (cod1 + cod2 + cod3 + cod4 + cod5) % 11;
            int digitoVerificador = 11 - resto;

            if (digitoVerificador == 10 || digitoVerificador == 11){
                digitoVerificador = 0;
            }
            System.out.println("Digito verificador: " + digitoVerificador);
            System.out.println("--------------------------------------");
        }
    }
}