import java.util.Scanner;

public class L5_ATV6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        float salario, salarioReajustado;
        char categoria;

        System.out.println("Digite a quantidade de funcionarios da empresa");
            int quantFuncionarios = Integer.parseInt(input.nextLine());

        for (int i = 0; i <= quantFuncionarios; i++){
            System.out.println("Digite o nome do funcionario");
                nome = String.valueOf(input.nextLine());
            System.out.println("Digite o salário");
                salario = Float.parseFloat(input.nextLine());
            System.out.println("""
                    Categoria A
                    Categoria B
                    Categoria C
                    Categoria D
                    Categoria E
                    Categoria F
                    Categoria G
                    Categoria H
                    Categoria I
                    Categoria J
                    Selecione a categoria do funcionario""");
                categoria = String.valueOf(input.nextLine()).charAt(0);

            salarioReajustado = calcularAumento(categoria, salario);
            System.out.println(nome + " teve seu salario reajustado para " + salarioReajustado + " Reais");
        }
    }
    public static float calcularAumento(char categoria, float salario){
        switch (categoria){
            case 'A': salario += salario * 0.1;
            case 'B': salario += salario * 0.12;
            case 'C': salario += salario * 0.14;
            case 'D': salario += salario * 0.16;
            case 'E': salario += salario * 0.18;
            case 'F': salario += salario * 0.2;
            case 'G': salario += salario * 0.22;
            case 'H': salario += salario * 0.24;
            case 'I': salario += salario * 0.26;
            case 'J': salario += salario * 0.28;
            default: salario += salario * 0.3;
        }
        return salario;
    }
}
