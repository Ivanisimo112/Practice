package com.company;

public class Truck extends Car{
    public Truck(){
        System.out.println("Це вантажна машина");
    }
    private CargoBody cargoBody = new CargoBody();
    @Override
    public void drive() {
        System.out.println("Ця машина їде з малою швидкістю");
    }
    public void drive(int i ) {
        System.out.println("Ця машина їде з швидкістю " + i + " км/год");
    }
}
