package Lesson03;

public abstract class Car {
    private String manufacture;
    private int year;
    private String color;
    private Engine engine;

    public Car(String manufacture, int year, String color) {
        this.manufacture = manufacture;
        this.year = year;
        this.color = color;

    }

    public Car(String manufacture, int year, String color, Engine engine) {
        this.manufacture = manufacture;
        this.year = year;
        this.color = color;
        this.engine = engine;
    }

    protected abstract String getName();

    public void gas() {
        engine.startEngine();
        System.out.println(getName() + " stared to move");
    }

    public void stop(){
        engine.stopEngine();
        System.out.println(getName() + " started to stop");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name= '" + getName() + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
