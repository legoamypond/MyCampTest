package com.mycamptest;
import java.math.*;
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
        //prints counselor name
        System.out.println("This is "+name+" of"+ " " +campName);
    }

    public void countsKids(){
        //prints the number of kids in the cabin
        System.out.println("There is " + numOfKids + " kids in their cabin.");
    }

}