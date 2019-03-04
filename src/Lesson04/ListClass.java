package Lesson04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListClass {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Bunny");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");
        animals.add("Bull");
        animals.add("Donkey");
        animals.remove("Donkey");

        Iterator<String> iter = animals.iterator();
        while (iter.hasNext()) System.out.println(iter.next());

        Collections.sort(animals);

        Iterator<String> iter2 = animals.iterator();
        while (iter2.hasNext()) System.out.println(iter2.next());


    }
}
