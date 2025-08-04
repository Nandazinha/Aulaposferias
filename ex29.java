import java.util.Scanner;

public class ex29 {

public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
    String[] nomes = {"Ana", "Bruno", "Carlos", "Daniela", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor", "Juliana"};

    System.out.print("Digite um nome para buscar: ");
    String nomeBusca = leia.nextLine();

    boolean encontrado = false;
    for (String nome : nomes) {
        if (nome.equalsIgnoreCase(nomeBusca)) {
            encontrado = true;
            break;
        }
    }

    if (encontrado) {
        System.out.println("Nome encontrado no vetor.");
    } else {
        System.out.println("Nome não encontrado no vetor.");
    }
    leia.close();
}
    
}