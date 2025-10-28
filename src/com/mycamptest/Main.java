package com.mycamptest;
import java.math.*;
public class Main{

    public static void main(String[] args){
        //Instantiates a Camp object 
        // Prints the name of the Camp
        // Prints the type of summer Camp
        Camp newCamp = new Camp("4H Cook camp","Summer Camp");
        newCamp.getCamp();
        newCamp.getOutCampType();

        //First generates realNumOfKids, this is the argument that will be used in the next object
        //Instantiates the Counselor object
        //Prints the Counselor name with the name of the camp
        //Prints the amount of kids(realNumOfKids) in the Counselr object 
        int realNumOfKids = (int)(Math.random()*11)+5;
        Counselor newCounselor = new Counselor("Sydney",realNumOfKids,"4H Cook camp","Summer Camp");
        newCounselor.intro();
        newCounselor.countsKids();
        

    } 
}