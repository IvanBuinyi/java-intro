package Lesson03;

public interface Climatble {

    default void climateControl(int temp){
        System.out.println("Air condition "+ temp);
    }

    default void climateStop(){
        System.out.println("Stopping climat control system");
    }
}
