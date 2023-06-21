import java.util.Scanner;

public class P3_Q2 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] quantP = {10, 4, 6, 12, 50, 42, 14, 49, 2, 36};
        String[] nomeP = {"Leite", "Açucar", "Farinha", "Manteiga", "Ovos", "Pão", "Queijo", "Presunto", "Salame", "Requeijão"};

        int menus;

        do {
            System.out.println("""
            ------------------------
            1 - Realizar venda
            2 - Repor estoque
            3 - Consultar estoque
            4 - Sair
            Digite o menu que deseja ir""");

            menus = Integer.parseInt(input.nextLine());
            switch (menus) {
                case 1:
                    realizeVendas(quantP, nomeP);
                    break;
                case 2:
                    reporEstoque(quantP, nomeP);
                    break;
                case 3:
                    consultarEstoque(quantP, nomeP);
                    break;
                case 4:
                    mostarEstoqueESair(quantP, nomeP);
                    break;
                case default:
                    System.out.println("Opção invalida");
                    break;
            }
        } while (menus != 4);
    }

    public static void realizeVendas(int[] quantP, String[] nomeP) {
        int locP = 0;

        System.out.println("------------------------");
        System.out.println("Digite o nome do produto");
        String nome = String.valueOf(input.nextLine());
        System.out.println("Digite a quantidade vendida");
        int vendido = Integer.parseInt(input.nextLine());

        for (int i = 0; i < 10; i++) {
            if (nome.equalsIgnoreCase(nomeP[i])) {
                locP = i;
            }
        }

        if (quantP[locP] < vendido) {
            System.out.println("Estoque Insuficiente \n");
        } else {
            quantP[locP] -= vendido;
        }
    }

    public static void reporEstoque(int[] quantP, String[] nomeP) {
        System.out.println("------------------------");
        System.out.println("Digite o nome do produto");
        String nome = String.valueOf(input.nextLine());
        System.out.println("Digite a quantidade reposta");
        int repor = Integer.parseInt(input.nextLine());

        for (int i = 0; i < 10; i++) {
            if (nome.equalsIgnoreCase(nomeP[i])) {
                quantP[i] += repor;
            }
        }
    }

    public static void consultarEstoque(int[] quantP, String[] nomeP) {
        System.out.println("------------------------");
        System.out.println("Digite o nome do produto");
        String nome = String.valueOf(input.nextLine());

        for (int i = 0; i < 10; i++) {
            if (nome.equalsIgnoreCase(nomeP[i])) {
                System.out.println("Estoque: " + quantP[i]);
            }
        }
    }

    public static void mostarEstoqueESair(int[] quantP, String[] nomeP) {
        System.out.println("------------------------");
        int totalP = 0, maiorE = 0, maisE = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(nomeP[i] + " - " + quantP[i]);
            totalP += quantP[i];
            if (quantP[i] > maiorE) {
                maiorE = quantP[i];
                maisE = i;
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("Total de produtos em estoque: " + totalP);
        System.out.println("Produto com mais estoque: " + nomeP[maisE] + " - " + quantP[maisE]);
        System.out.println("---------------------------------------");
    }
}