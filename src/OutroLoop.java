import java.util.Scanner;
import static java.lang.Float.NaN;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliação = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga a sua avaliação para o filme ou -1 para encerrar");
            nota = leitura.nextDouble();
            if(nota!=-1){
                mediaAvaliação += nota;
                totalDeNotas ++;
            }
            if (nota == -1) {
                System.out.println("Muito obrigado!");
            }
        }
        if (totalDeNotas>=1){
            System.out.println(String.format("Media de avaliações: %.2f", mediaAvaliação/totalDeNotas));
        }
    }
}
