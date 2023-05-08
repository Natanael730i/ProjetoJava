import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu Filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Qual é o ano de lançamento: ");
        int ano = leitura.nextInt();
        System.out.println("Diga a sua avaliação para o filme");
        double avaliacao = leitura.nextDouble();

        System.out.println("Filme informado: " + filme);
        System.out.println("Ano de Lançamento informado: " + ano);
        System.out.println("Avaliação informada: " + avaliacao);
    }
}