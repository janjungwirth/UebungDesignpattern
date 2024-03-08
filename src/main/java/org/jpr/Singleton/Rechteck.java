package org.jpr.Singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rechteck {
    private int centralPoint;
    private int length;
    private int width;



    private Rechteck(int centralPoint, int length, int width) {
        this.centralPoint = centralPoint;
        this.length = length;
        this.width = width;
    }

    private Rechteck(){

    }

    @Override
    public String toString() {
        return "RechteckBuilder{" +
                "centralPoint=" + centralPoint +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    public static class RechteckBuilder {
        private int centralPoint;
        private int length;
        private int width;

        public RechteckBuilder withCentralPoint (int centralPoint){
            this.centralPoint = (centralPoint);
            return this;
        }

        public RechteckBuilder withLength (int length){
            this.length = (length);
            return this;
        }

        public RechteckBuilder withWidth (int width){
            this.width = width;
            return this;
        }

        public Rechteck build () {
            return new Rechteck(centralPoint,length,width);
        }


    }
}
