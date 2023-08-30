package fruta;

public class Lampada {
    private boolean estadoOnOff;
    private int numeroWatts;

    public Lampada(boolean estadoOnOff) {
        this.estadoOnOff = estadoOnOff;
    }
    public Lampada(boolean estadoOnOff, int numeroWatts){
        this.estadoOnOff = estadoOnOff;
        this.numeroWatts = numeroWatts;
    }
    public Lampada(){
        this.estadoOnOff = false;
        this.numeroWatts = 60;
    }
    public void imprimirInfo(){
        System.out.println(this.estadoOnOff);
        System.out.println(this.numeroWatts);
    }
    
}
