package com.company;

public class Truck extends Car{
    Truck(){
        System.out.println("Це вантажна машина");
    }
    CargoBody cargoBody = new CargoBody();
}
