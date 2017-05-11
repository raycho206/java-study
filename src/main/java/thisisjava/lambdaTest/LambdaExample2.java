package thisisjava.lambdaTest;

import java.util.function.IntBinaryOperator;

public class LambdaExample2 {
    private static int[] scores = {10, 50, 3};

    public static void main(String[] args) {
        int max = maxOrMin(
                (x, y) -> {
                    if (x >= y) {
                        return x;
                    } else {
                        return y;
                    }
                }
        );
        System.out.println("최대값: " + max);

        int min = maxOrMin(
                (x, y) -> {
                    if (x <= y) {
                        return x;
                    } else {
                        return y;
                    }
                }
        );
        System.out.println("최소값: " + min);
    }

    private static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.applyAsInt(result, score);
        }

        return result;
    }

}
