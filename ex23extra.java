import com.sun.source.tree.LineMap;
import java.util.Scanner;

public class ex23extra {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        Scanner leia = new Scanner(System.in);

        // Preencher o vetor com valores digitados pelo usuário
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número inteiro para a posição " + i + ": ");
            vetor[i] = leia.nextInt();
        }

        // Exibir os valores do vetor
        System.out.println("Valores armazenados no vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }

        leia.close();
    }
}