package com.UkrPolitSystem;

public class PolitOrganisation {
    String name;
    int size;
    Person leader;
    int voices;
    int rating=50;
    boolean orientation;//1-west 0-east

    public PolitOrganisation(String name,int size,Person leader,boolean orientation){
        this.name=name;
        this.size=size;
        this.orientation=orientation;
        this.leader=leader;
    }
    public int ratingCounter(int rating,Law law){
        if(voices>(0.5*size)){
            rating=rating+law.support;
        }
        return rating;
    }

}

