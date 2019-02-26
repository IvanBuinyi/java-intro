package Lesson03;

import Lesson02.Person;

public class PasengerCar extends Car implements Climatble {

    private Person[] persons;

    public PasengerCar(String manufacture, int year, String color) {
        super(manufacture, year, color);
    }

    public PasengerCar(String manufacture, int year, String color, Engine engine) {
        super(manufacture, year, color, engine);
    }

    @Override
    public void climateControl(int temp) {
        System.out.println("Climate control tries to make temp: " + temp);

    }

    @Override
    protected String getName() {
        return "Passenger car";
    }
}
