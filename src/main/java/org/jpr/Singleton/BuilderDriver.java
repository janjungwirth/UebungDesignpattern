package org.jpr.Singleton;

public class BuilderDriver {


    public static void main(String[] args) {

        Rechteck rechteck = new Rechteck.RechteckBuilder()
                .withWidth(10)
                .withCentralPoint(30)
                .withLength(20)
                .build();

//        RechteckBuilder tempRechteck = new RechteckBuilder(1,1,1);

        System.out.println(rechteck);

    }


}
