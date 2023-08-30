public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //resolucao lampada
        Lampada lamp1 = new Lampada();
        Lampada lamp2 = new Lampada(estadoOnOff:true);
        Lampada lamp3 = new Lampada(estadoOnOff:true, numeroWatts:60);

    }
}
