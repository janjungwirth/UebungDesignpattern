package org.jpr.Singleton;

public class SingletonDriver {
    public static void main(String[] args) {

        Dreieck d = Dreieck.getInstance();
        Dreieck y = Dreieck.getInstance();


        d.changeParamenter(1,1,1);
        System.out.println(d); //1 1 1
        d.changeParamenter(2,2,2);
        System.out.println(d); //2 2 2

        y.changeParamenter(3,3,3);
        System.out.println(y); //3 3 3
        System.out.println(d); //3 3 3

        d.changeParamenter(4,4,4);
        System.out.println(y);

        System.out.println(d.equals(y));

    }
}
