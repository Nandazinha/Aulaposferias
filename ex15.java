import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7: ");
        int numero = leia.nextInt();

        String dia;
        switch (numero) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Número inválido. Por favor, digite um número de 1 a 7.";
        }

        System.out.println(dia);
        leia.close();
    }
}