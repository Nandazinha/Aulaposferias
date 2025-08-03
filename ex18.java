public class ex18 {
    public static void main(String[] args) {
        int soma = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}