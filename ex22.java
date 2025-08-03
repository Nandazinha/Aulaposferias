import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = leia.nextInt();
        }

        System.out.println("Valores digitados:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        leia.close();
    }
}