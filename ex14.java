import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double a = leia.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double b = leia.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double c = leia.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os valores podem formar um triângulo.");
        } else {
            System.out.println("Os valores NÃO podem formar um triângulo.");
        }

        leia.close();
    }
}