import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu Filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println(filme);
    }
}
