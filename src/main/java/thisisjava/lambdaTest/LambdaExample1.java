package thisisjava.lambdaTest;

import java.util.function.IntSupplier;

public class LambdaExample1 {

    public static void main(String[] args) {
        System.out.println(method(3, 5));
    }

    private static int method(int x, int y) {
        IntSupplier supplier = () -> {
            int result = x + y;
            return result;
        };
        return 0;
    }

}
