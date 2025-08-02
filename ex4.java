import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = leia.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = leia.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = leia.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média aritmética das notas é: %.2f%n", media);

        leia.close();
    }
}