import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        double[] notas = new double[5];
        Scanner leia = new Scanner(System.in);
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = leia.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.printf("A média das notas é: %.2f%n", media);

        leia.close();
    }
}