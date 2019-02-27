package Lesson02;

public class Hwork1 {

    public Hwork1(String s, int n) {
        String b = s;
        if (b.length() == 0) System.out.println("Strint shouldn't be empty");
        else {
            for (int i = 0; i < s.length(); i = i + n)
                System.out.println(s.charAt(i));
        }
    }
}


