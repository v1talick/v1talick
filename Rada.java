package com.UkrPolitSystem;

import java.util.Random;

public class Rada {
    PolitOrganisation[] politOrganisations;
    //int[] voicesOfOrganisatoins;

    public void Voiting(PolitOrganisation[] politOrganisations){
        Random rnd=new Random();
        int totalVoices=0;
        for (int i = 0; i <politOrganisations.length-1; i++){
            //voicesOfOrganisatoins[i]=rnd.nextInt(0,politOrganisations[i].size);
            politOrganisations[i].voices=rnd.nextInt(0,politOrganisations[i].size);
            System.out.println(politOrganisations[i].name+":"+politOrganisations[i].voices);
            totalVoices=totalVoices+politOrganisations[i].voices;
        }
        System.out.println("Total amount of voices:"+totalVoices);
    }
}

