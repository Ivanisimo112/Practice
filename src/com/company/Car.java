package com.company;

public class Car {
    private Brakes brakes = new Brakes();
    private Engine engine = new Engine();
    private FrontSeats frontSeats = new FrontSeats();
    private Headlights headlights = new Headlights();
    private Wheel wheel = new Wheel();
    protected Car(){

    }
    public void drive(){
        System.out.println("Ця машина їде");
    }
}
