package thisisjava.lambdaTest;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
    private static int[] scores = {92, 95, 97};

    public static void main(String[] args) {
        int max = maxOrMin(
                (a, b) -> {
                    if (a >= b) {
                        return a;
                    } else {
                        return b;
                    }
                }
        );
        System.out.println("최대값: " + max);

        int min = maxOrMin(
                (a, b) -> {
                    if (a <= b) {
                        return a;
                    } else {
                        return b;
                    }
                }
        );
        System.out.println("최소값: " + min);

        int min2 = maxOrMin(new IntBinaryOperator() {
            @Override
            public int applyAsInt(int a, int b) {
                if (a <= b) {
                    return a;
                } else {
                    return b;
                }
            }
        });
    }

    private static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.applyAsInt(result, score);
        }

        return result;
    }

}
