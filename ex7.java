import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = leia.nextInt();
        System.out.println("Antecessor: " + (numero - 1));
        System.out.println("Sucessor: " + (numero + 1));
        leia.close();
    }
}