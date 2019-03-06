package Lesson02;

public class Hwork1 {

    public void everyNth(String s, int n) {
       // String b = s;
        StringBuilder sb = new StringBuilder();
        if (s.length() == 0) System.out.println("Strint shouldn't be empty");
        else {
            for (int i = 0; i < s.length(); i = i + n) {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}


