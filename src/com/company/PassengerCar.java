package com.company;

public class PassengerCar extends Car{
    public PassengerCar(){
        System.out.println("Це легкова машина");
    }
    private RearSeats rearSeats = new RearSeats();

    @Override
    public void drive() {
        System.out.println("Ця машина їде з середньою швидкістю");
    }
    public void drive(int i ) {
        System.out.println("Ця машина їде з швидкістю " + i + " км/год");
    }
}
