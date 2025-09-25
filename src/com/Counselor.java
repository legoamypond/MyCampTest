package com.mycamptest;
public class Counselor extends Camp {

    //attribute fields
    private String name;
    private int numOfKids;

    //constructor method
    public Counselor(String name, int numOfKids,campName){
        super(campName);
        this.name = name;
        this.numOfKids = numOfKids;
    }

    //behavoirs
    public void intro(){
        system.out.println("This is "+name+" of"+ " " +campName +". They have " + numOfKids + "in their cabin.")
    }

}