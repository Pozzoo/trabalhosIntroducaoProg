import java.util.Scanner;

public class calculadoraCarga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float pesoBruto, valorTon, tara;
        int codigoRegiao;
        double pesoLiquido, imposto, valorTotal, valorSemImp;

        System.out.println("Digite o peso bruto");
        pesoBruto = Float.valueOf(input.nextLine());
        System.out.println("Digite o valor por tonelada");
        valorTon = Float.valueOf(input.nextLine());
        System.out.println("Digite a tara");
        tara = Float.valueOf(input.nextLine());
        System.out.println("Digite o codigo da região\n" +
                "1 - Sul\n" +
                "2 - Sudeste\n" +
                "3 - Centro-Oeste\n" +
                "4 - Nordeste\n" +
                "5 - Norte");
        codigoRegiao = Integer.valueOf(input.nextLine());

        pesoLiquido = (pesoBruto - tara) * 1000;
        valorSemImp = (pesoLiquido / 1000) * valorTon;
        imposto = 0;

        switch (codigoRegiao){
            case 1:
                imposto = valorSemImp * 0.1;
                break;
            case 2:
                imposto = valorSemImp * 0.12;
                break;
            case 3:
                imposto = valorSemImp * 0.09;
                break;
            case 4:
                imposto = valorSemImp * 0.095;
                break;
            case 5:
                imposto = valorSemImp * 0.08;
                break;
            default:
                System.out.println("Código de região invalido");
        }

        valorTotal = valorSemImp + imposto;

        System.out.println("Peso liquido: " + pesoLiquido);
        System.out.println("Imposto: " + imposto);
        System.out.println("Valor total: " + valorTotal);

    }
}
