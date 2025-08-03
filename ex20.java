import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int num = leia.nextInt();
        long fatorial = 1;

        for (int i = num; i > 1; i--) {
            fatorial *= i;
        }

        System.out.println(num + "! = " + fatorial);
        leia.close();
    }
}