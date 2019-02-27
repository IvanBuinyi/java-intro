package Lesson03;

public class Fibonacci {


    public void  printFibonacciNumbers(int n){
        if (n<0){
            System.out.println("Please enter a positive number more than 0");
        }else if (n==0){
            System.out.println("Please enter a positive number more than 0");
        } else{

            int a = 0;
            int b = 1;

            for (int i=0;i<n; ++i){
                int next = a + b;
                a = b;
                b = next;
                System.out.println("Fibonacci number :"+ b);
            }
        }
    }
}
