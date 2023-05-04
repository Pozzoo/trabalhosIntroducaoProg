import java.util.Scanner;

public class calculadoraIMC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float p, a1, a, imc;
        boolean acimaP;

        System.out.println("Digite seu peso");
        p = Float.valueOf(scanner.nextLine());
        System.out.println("Digite sua altura");
        a = Float.valueOf(scanner.nextLine());

        if (a > 100.0){
            a1 = a/100;
            imc = p / (a1 * a1);
        }
        else {
        imc = p / (a * a);
        }

        System.out.println("Seu IMC é: "+ imc);

        if (imc > 30){
            System.out.println("Situação: Sobrepeso");
        } else if(imc >=25){
            System.out.println("Situação: Obeso");
        } else if (imc >= 20) {
            System.out.println("Situação: Peso normal");
        } else {
            System.out.println("Situação: Magrez");
        }
    }
}
