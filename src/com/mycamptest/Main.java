package com.mycamptest;
import java.math.*;
import java.util.Scanner;
public class Main{

    public static void main(String[] args){
        Scanner testScan = new Scanner(System.in);
        System.out.println("You drive up a road and see there is a Summer Camp, Would you like to take a closer look? Write Y or N");
        String testInput = testScan.nextLine(); 
        if (testInput.equals("Y")){
             System.out.println("OK! Lets take a look!");
            //Instantiates a Camp object 
            // Prints the name of the Camp
            // Prints the type of summer Camp
        
            Camp newCamp = new Camp("4H Cook camp","Sleepaway Camp");
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
        else{
            System.out.println("Where is your sense of adventure?");
        }
        
        
       
        
        

    } 
}