import java.util.Scanner;

public class ex6{

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = leia.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = leia.nextDouble();

        double area = base * altura;
        System.out.println("A área do retângulo é: " + area);

        leia.close();
    }

}