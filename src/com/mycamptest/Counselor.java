package com.mycamptest;
public class Counselor extends Camp{

    //attribute fields
    private String name;
    private int numOfKids;

    //constructor method
    public Counselor(String name, int numOfKids,String campName,String typeOfCamp){
        super(campName,typeOfCamp);
        this.name = name;
        this.numOfKids = numOfKids;
    }

    //behavoirs
    public void intro(){
        System.out.println("This is "+name+" of"+ " " +campName +". They have " + numOfKids + " in their cabin.");
    }

}