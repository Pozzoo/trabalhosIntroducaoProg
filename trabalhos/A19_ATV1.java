import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A19_ATV1 {
    public static void main(String[] args) {
        try {
            FileReader arquivo = new FileReader("dadosVenda.txt");
            BufferedReader bufferLeitura = new BufferedReader(arquivo);
            FileWriter eArquivo = new FileWriter("dadosReceita.txt");

            float receitaTotal = 0;
            String nomeProduto = bufferLeitura.readLine();

            while (nomeProduto != null){
                int vendaProduto = Integer.parseInt(bufferLeitura.readLine());
                float precoProduto = Float.parseFloat(bufferLeitura.readLine());

                receitaTotal += (vendaProduto * precoProduto);

                eArquivo.write(nomeProduto + " - " + (vendaProduto*precoProduto) + "\n");
                nomeProduto = bufferLeitura.readLine();
            }

            eArquivo.close();
            System.out.println("Receita total: " + receitaTotal);

        } catch (IOException e){
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
    }
}