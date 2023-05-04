import java.util.Scanner;

public class menuCadastro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menuSelecionado;

        System.out.println("1 - Cadastrar cliente\n" +
                "2 - Editar cliente\n" +
                "3 - Cadastrar produto\n" +
                "4 - Editar produto\n" +
                "5 - Efetuar venda\n" +
                "6 - Sair\n" +
                "Para qual menu deseja ir");

        menuSelecionado = Integer.valueOf(input.nextLine());

        switch (menuSelecionado){
            case 1:
                System.out.println("Cadastrar cliente");
                break;
            case 2:
                System.out.println("Editar cliente");
                break;
            case 3:
                System.out.println("Cadastrar Produto");
                break;
            case 4:
                System.out.println("Editar Produto");
                break;
            case 5:
                System.out.println("Efetuar venda");
                break;
            case 6:
                System.out.println("Vou embora");
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
