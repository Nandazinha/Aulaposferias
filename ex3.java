import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");

        int num1 = leia.nextInt();
        System.out.print("Digite o segundo número inteiro: ");

        int num2 = leia.nextInt();
        int soma = num1 + num2;

        System.out.println("A soma dos números é: " + soma);
        
        leia.close();
    }
}