package org.jpr.Tiere;

import java.util.LinkedList;
import java.util.List;

public class TierDriver {
    private static List<Tier> tierListe = new LinkedList<>();

    public static void main(String[] args) {
        tierListe.add(new Hund());
        tierListe.add(new Katze());

        ((Hund)tierListe.getFirst()).setName("Lukas");

        for(Tier t:tierListe){
            System.out.println(t.getClass() + " " + t.getName());
        }
    }
}
