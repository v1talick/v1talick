package com.UkrPolitSystem;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PolitOrganisation Ze=new PolitOrganisation("Sluga Narodu",240,new Person("Zelenskyy"),true);
        //System.out.println(Ze.leader.name);

        PolitOrganisation OPZH=new PolitOrganisation("OPZH",34,new Person("Medvedchuk"),false);
        PolitOrganisation ES=new PolitOrganisation("Europian Solidarity",37,new Person("Poroshenko"),true);
        PolitOrganisation Golos=new PolitOrganisation("Golos",20,new Person("Vakarchuk"),true);
        PolitOrganisation Motherland=new PolitOrganisation("Motherland",36,new Person("Timohenko"),true);

        PolitOrganisation[] politOrganisations={Ze,OPZH,ES,Golos,Motherland};

        Rada rada=new Rada();
        rada.Voiting(politOrganisations);
//        System.out.println();
        System.out.println();
    }
}
