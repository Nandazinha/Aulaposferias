import java.util.Scanner;

public class ex26 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] vetor = new int[6];

        System.out.println("Digite 6 números:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = leia.nextInt();
        }

        System.out.println("Valores na ordem inversa:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        leia.close();
    }

}