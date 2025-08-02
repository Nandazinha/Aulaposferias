import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor em Reais (R$): ");
        double valorReais = leia.nextDouble();

        System.out.print("Digite a cotação do dólar (US$): ");
        double cotacaoDolar = leia.nextDouble();

        double valorDolares = valorReais / cotacaoDolar;

        System.out.printf("Valor em Dólares: US$ %.2f%n", valorDolares);

        leia.close();
    }
}