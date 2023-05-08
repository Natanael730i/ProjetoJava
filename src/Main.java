public class Main {
    public static void main(String[] args) {
        System.out.println("Este é o Screen Match");
        System.out.println("Filme: Top Gam: Maverick");

        int ano = 2022;
        //Média calculada pelas 3 notas do filme
        /*
        * Comentário de mais de uma linha
        */
        double media = (9.8 + 6.2 + 8.0)/3;

        System.out.println(media);

        String Sinopse = """
        Filme Top Gun
        Filme de aventura com galâ dos anos 80
        Muito bom!
        Ano de lançamento:
        """ + ano;
        System.out.println(Sinopse);

        String nome = "Natanael";
        Integer idade = 26;
        Double valorGasto = 6.0;
        System.out.println("\n");
        System.out.println(String.format("Meu nome é %s, eu tenho %d " +
                "anos e hoje gastei %.2f reais", nome, idade, valorGasto));

//        cast explcito
        double classificacao = media/2;

        System.out.println(classificacao);

    }
}