import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] vetorUnido = new int[10];

        // Preenchendo o primeiro vetor
        System.out.println("Preencha o primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("vetor1[" + i + "]: ");
            vetor1[i] = leia.nextInt();
        }

        // Preenchendo o segundo vetor
        System.out.println("Preencha o segundo vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("vetor2[" + i + "]: ");
            vetor2[i] = leia.nextInt();
        }

        // Unindo os vetores
        for (int i = 0; i < 5; i++) {
            vetorUnido[i] = vetor1[i];
        }
        for (int i = 0; i < 5; i++) {
            vetorUnido[i + 5] = vetor2[i];
        }

        // Exibindo o vetor unido
        System.out.println("Vetor unido:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorUnido[i] + " ");
        }
        System.out.println();

        leia.close();
    }
}