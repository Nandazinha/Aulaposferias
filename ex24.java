import java.util.Random;
import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner leia = new Scanner(System.in);
        Random random = new Random();

        // Preenchendo o vetor com números aleatórios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100); // números aleatórios de 0 a 99
            // vetor[i] = scanner.nextInt();
        }

        // Encontrando o maior valor
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        // Exibindo o vetor e o maior valor
        System.out.print("Vetor: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println("\nMaior valor: " + maior);

        leia.close();
    }
}