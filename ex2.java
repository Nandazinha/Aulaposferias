import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = leia.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = leia.nextLine();

        System.out.println("Nome completo: " + nome + " " + sobrenome);
        
        leia.close();
    }
}