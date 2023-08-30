public class App {
    public static void main(String[] args) throws Exception {
        int valorInt = 10;
        long valorLong = 80;
        //float valorFloat = 4.2f; //sempre colocar f no valor float. 
        double valorDouble = 5000;
        boolean valorBoolean = false;
        String nome = "Gerson";

        System.out.println(valorDouble + valorInt);
        System.out.println(valorInt / valorDouble);

        System.out.println("Hello, World!" + valorInt + nome);
        System.out.println(valorInt);
        System.out.println(!(true)); //! == not
        System.out.println(1 != 2);

        System.out.println(++valorInt);
        System.out.println(valorInt++); 
        valorInt += 2;
    }
}
