package Lesson03;

public class Programm {

    public static void main(String[] args) {
        Track track = new Track ( "Renault", 2001, "White", new Engine(5.2) );
        PasengerCar pasengerCar = new PasengerCar("Daewoo", 2005,"Silver", new Engine(1.6));
        Fibonacci fibonacci = new Fibonacci();

        System.out.println(track);
        System.out.println(pasengerCar);

        track.gas();
        pasengerCar.gas();
        pasengerCar.climateControl(27);
        pasengerCar.stop();
        pasengerCar.climateStop();
        track.stop();
        fibonacci.printFibonacciNumbers(7);


    }
}
