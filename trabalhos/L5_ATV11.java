import java.util.Scanner;

public class L5_ATV11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char contunue = 'S';
        float gastoT, totalA = 0, gastoTAlunos = 0;
        int nAlunos = 0;
        
        while (contunue == 'S'){
            nAlunos++;

            System.out.println("Digite o nome do aluno");
            String nome = String.valueOf(input.nextLine());
            System.out.println("Digite a renda mensal da familia");
            float renda = Float.parseFloat(input.nextLine());
            System.out.println("Digite o gasto com alimentação");
            float gastoA = Float.parseFloat(input.nextLine());
            System.out.println("Digite o gasto com aluguel");
            float gastoAl = Float.parseFloat(input.nextLine());
            System.out.println("Digite os outros gastos");
            float gastoDiverso = Float.parseFloat(input.nextLine());

            gastoT = gastoA + gastoAl + gastoDiverso;

            System.out.println("Gasto total de " + nome + ": " + gastoT);
            System.out.println("Proporção de alimentação e renda: " + (renda - gastoA));
            System.out.println("Proporção de aluguel e renda: " + (renda - gastoAl));

            totalA =+ gastoAl;

            if (renda > 2000){
                gastoTAlunos += gastoT;
            }

            System.out.println("""
                    --------------------------------
                    Deseja adicionar mais um aluno?
                    S / N""");
            contunue = input.nextLine().toUpperCase().charAt(0);
            System.out.println("--------------------------------");
        }
        float mediaA = totalA / nAlunos;
        float mediaG = gastoTAlunos / nAlunos;
        
        System.out.println("Gasto medio com aluguel: " + mediaA);
        System.out.println("Gasto total medio de familias com renda menor de 2000 reais: " + mediaG);
    }
}
