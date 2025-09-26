package com.mycamptest;
public class Camp {

//atributes fields

public String campName;
public String typeOfCamp;

//constructor method

public Camp(String campName,String typeOfCamp){
    this.campName = campName;
    this.typeOfCamp = typeOfCamp;

}

//behavoirs
public void getCamp(){
    System.out.println("Welcome to "+ campName);
}

public void getOutCampType(){
    System.out.println("This is a "+ typeOfCamp);
}




} 