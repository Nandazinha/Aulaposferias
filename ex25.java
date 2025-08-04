public class ex25 {
    public static void main(String[] args) {
        int[] vetor = {5, 8, 12, 3, 7, 9, 4, 6}; // exemplo de preenchimento
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        System.out.println("Soma dos elementos: " + soma);
    }
}