import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leia.nextInt();

        int dobro = numero * 2;
        int triplo = numero * 3;

        System.out.println("Dobro: " + dobro);
        System.out.println("Triplo: " + triplo);

        leia.close();
    }
}