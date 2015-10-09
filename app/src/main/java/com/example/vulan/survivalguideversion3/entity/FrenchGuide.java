package com.example.vulan.survivalguideversion3.entity;

/**
 * Created by VULAN on 10/5/2015.
 */
public class FrenchGuide {

    private String frenchSentence;


    public FrenchGuide( String frenchSentence ){

        this.setFrenchSentence(frenchSentence);


    }
    public FrenchGuide(){


    }
    public String getFrenchSentence() {
        return frenchSentence;
    }

    public void setFrenchSentence(String frenchSentence) {
        this.frenchSentence = frenchSentence;
    }
}
