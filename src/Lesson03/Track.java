package Lesson03;

public class Track extends Car implements Climatble {

    public Track(String manufacture, int year, String color) {
        super(manufacture, year, color);
    }

    public Track(String manufacture, int year, String color, Engine engine) {
        super(manufacture, year, color, engine);
    }

    @Override
    protected String getName() {
        return "Track";
    }
}
