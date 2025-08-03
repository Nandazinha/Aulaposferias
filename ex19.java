import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String senhaCorreta = "1234";
        String senhaDigitada;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = leia.nextLine();
            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senhaDigitada.equals(senhaCorreta));

        System.out.println("Senha correta! Acesso permitido.");
        leia.close();
    }
}