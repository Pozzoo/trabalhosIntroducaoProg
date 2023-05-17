import java.util.Scanner;

public class P2_Q3 {

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Digite o valor do salario minimo");
        float salario = Float.parseFloat(input.nextLine());
        System.out.println("Digite a quantidade de funcionarios da empresa");
        int funcionarios = Integer.parseInt(input.nextLine());

        entrarInformacoes(funcionarios, salario);
    }
    public static void entrarInformacoes(int quantF, float salarioMin){
        int horas, horasE, depend;
        float maiorSalario = 0, salarioT = 0;

        for (int i = 1; i <= quantF; i++){
            System.out.println("Digite a quantidade de horas trabalhadas pelo " + i + "º funcionario");
            horas = Integer.parseInt(input.nextLine());
            System.out.println("Digite a quantidade de horas extras trabalhadas pelo " + i + "º funcionario");
            horasE = Integer.parseInt(input.nextLine());
            System.out.println("Digite a quantidade de dependentes do " + i + "º funcionario");
            depend = Integer.parseInt(input.nextLine());

            float salarioBruto = calcularSalarioBruto(salarioMin, horas, horasE, depend);
            float salarioLiquido = calcularSalarioLiquido(salarioBruto);

            if (salarioBruto > maiorSalario){
                maiorSalario = salarioBruto;
            }

            salarioT += salarioBruto;

            System.out.println("----------------------------------------------");
            System.out.println("Salario Bruto do " + i + "º funcionario: " + salarioBruto);
            System.out.println("Salario Liquido do " + i + "º funcionario: " + salarioLiquido);
            System.out.println("----------------------------------------------");
        }

        float salarioMed = salarioT/quantF;

        System.out.println("O maior salario bruto é de: " + maiorSalario);
        System.out.println("A media de salarios é: " + salarioMed);
    }
    public static float calcularSalarioBruto(float salarioMin, int horas, int horasE, int depend){
        float valorH = (salarioMin/10f);
        float salarioMes = valorH * horas;
        float abonoDependente = depend * 320;
        float valorHoraE = (valorH + (valorH * 0.5f)) * horasE;

        return (salarioMes + abonoDependente + valorHoraE);
    }
    public static float calcularSalarioLiquido(float salarioBruto){
        float irpf, inss;
        if (salarioBruto < 2000){
            irpf = 0;
        } else if (salarioBruto >= 2000 && salarioBruto < 4000){
            irpf = 0.1f;
        } else if (salarioBruto >= 4000 && salarioBruto < 7000){
            irpf = 0.15f;
        } else {
            irpf = 0.2f;
        }

        if (salarioBruto < 5000){
            inss = 0.08f;
        } else {
            inss = 0.11f;
        }

        float salarioLiquido = salarioBruto - ((salarioBruto * irpf) + (salarioBruto * inss));
        return (salarioLiquido);
    }
}