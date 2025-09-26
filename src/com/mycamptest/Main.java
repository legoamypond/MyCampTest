package com.mycamptest;
public class Main{

    public static void main(String[] args){
        Camp newCamp = new Camp("4H Cook camp","Summer Camp");
        newCamp.getCamp();
        newCamp.getOutCampType();

        Counselor newCounselor = new Counselor("Sydney",15,"4H Cook camp","Summer Camp");
        newCounselor.intro();
    } 
}