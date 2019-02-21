package Lesson02;

import java.util.Objects;

public class Person {

    String firstName;
    String secondName;
    int age;
    private static int count=0;

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        count++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                firstName.equals(person.firstName) &&
                secondName.equals(person.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }

    void doSomthing () {
        String end = "is doing something";

        System.out.println(firstName + " " + secondName + end);
    }

    static  {
        System.out.println("First class loading");
    }
    {
        System.out.println(count + " class loading");
    }

}

