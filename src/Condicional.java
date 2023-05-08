public class Condicional {
    public static void main(String[] args) {


        int ano = 1990;
        double media = (9.8 + 6.2 + 8.0)/3;
        boolean incluidoNoPlano = true;
        String tipoPlano = "Plus";

        if(ano>=2022){
            System.out.println("Lançamento que os clientes estão curtindo");
        }else {
            System.out.println("Filme retrô que vale a pena assistir");
        }
        if(incluidoNoPlano && tipoPlano.equals("Plus")){
        System.out.println("Filme liberado");
        }else {
            System.out.println("Deve Pagar a Locação!!!");
        }
    }
}
