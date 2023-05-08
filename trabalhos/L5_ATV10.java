import java.util.Scanner;

public class L5_ATV10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu = 0;

        while (menu != 5){
            System.out.println("""
                1 – Inclusão de cliente.
                2 – Alteração de cliente.
                3 – Exclusão de cliente.
                4 – Visualização de cliente.
                5 – Sair.
                ----------------------------------
                Escolha o menu que deseja ir: """);
            menu = Integer.parseInt(input.nextLine());

            if (menu == 1){
                System.out.println("Menu de inclusão do cliente");
                System.out.println("-----------------------------");
            } else if (menu == 2){
                System.out.println("Menu de alteração do cliente");
                System.out.println("-----------------------------");
            } else if (menu == 3) {
                System.out.println("Menu de exclusão do cliente");
                System.out.println("-----------------------------");
            } else if (menu == 4) {
                System.out.println("Menu de visualização do cliente");
                System.out.println("-----------------------------");
            } else if (menu != 5) {
                System.out.println("Opção invalida");
                System.out.println("-----------------------------");
            }
        }
    }
}