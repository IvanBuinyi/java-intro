package Lesson04;

public class LiambdaApp {
    public static void main(String[] args) {
        int[] array = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        Expression exp1 = ExpressionUtils::isEven;
        Expression exp2 = ExpressionUtils::isNegative;
        Expression exp3 = (int i) -> i >= 0;

        System.out.println(sumOf(array, exp1));
        System.out.println(sumOf(array, exp2));
        System.out.println(sumOf(array, exp3));
        System.out.println(sumOf(array, (int i) -> i%2!=0)); //isOdd
    }

    private static int sumOf(int[] arr, Expression expression ){
        int result = 0;

        for (int i : arr){
            if (expression.isEqual(i)){
                result +=i;
            }
        }
        return result;
    }

}
