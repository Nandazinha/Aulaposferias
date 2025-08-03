import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Escolha a operação:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Opção: ");
        int opcao = leia.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = leia.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = leia.nextDouble();

        double resultado;
        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.printf("Resultado: %.2f%n", resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        leia.close();
    }
}