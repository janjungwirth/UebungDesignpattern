package org.jpr.Singleton;

public class Dreieck {
    private int mittelpunkt;
    private int kante;
    private int winkel;
    static Dreieck dreieck = null;

    private Dreieck(){
    }

    public static Dreieck getInstance(){
        if(dreieck==null){
            dreieck = new Dreieck();
        }
        return dreieck;
    }

    public void changeParamenter(int mittelpunkt, int kante, int winkel){
        this.mittelpunkt = mittelpunkt;
        this.kante = kante;
        this.winkel = winkel;
    }

    @Override
    public String toString() {
        return "Dreieck{" +
                "mittelpunkt=" + mittelpunkt +
                ", kante=" + kante +
                ", winkel=" + winkel +
                '}';
    }
}
