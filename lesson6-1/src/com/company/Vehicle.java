package com.company;

public class Vehicle {

    int n;
    int id;
    String name;
    int speed;

    Vehicle(int myId, String myName,int mySpeed){

        name = myName;
        id = myId;
        speed = mySpeed;
    }

    void display(){
        System.out.println(id+ " - " + name +" - "+ speed);
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + speed;
    }
}
