import java.util.Scanner;

public class aumentoSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char categoria;
        String nome;
        float salario;

        System.out.println("Digite o nome do funcionário");
            nome = String.valueOf(input.nextLine());
        System.out.println("""
                [A]
                [B]
                [C]
                [D]
                [E]
                [F]
                [G]
                [H]""");
        System.out.print("Escolha a categoria do funcionário --> ");
            categoria = String.valueOf(input.nextLine()).charAt(0);
        System.out.println("Digite o salario atual");
            salario = Float.valueOf(input.nextLine());


        switch(categoria){
            case 'A', 'H':
                salario = salario * 1.1f;
                break;
            case 'B', 'E', 'D':
                salario = salario * 1.15f;
                break;
            case 'C', 'F':
                salario = salario * 1.25f;
                break;
            case 'G':
                salario = salario * 1.3f;
            default:
                System.out.println("Insira uma categoria válida");
        }
        System.out.println(nome + " da categoria " + categoria + " possui um novo salário de: " + salario + " Reais");
  
    }
}
