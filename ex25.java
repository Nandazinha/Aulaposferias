public class ex25 {
    public static void main(String[] args) {
        int[] vetor = new int[8];
        int soma = 0;

        // Preenchendo o vetor com valores de exemplo
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1; // Preenche com valores de 1 a 8
        }

        // Calculando a soma dos elementos
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}