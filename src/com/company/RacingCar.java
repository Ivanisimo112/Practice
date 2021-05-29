package com.company;

public class RacingCar extends Car{
    public RacingCar(){
        System.out.println("Це гоночна машина");
    }
    private CarSpoilers carSpoilers = new CarSpoilers();

    @Override
    public void drive() {
        System.out.println("Ця машина їде з великою швидкістю");
    }
    public void drive(int i ) {
        System.out.println("Ця машина їде з швидкістю " + i + " км/год");
    }
}
