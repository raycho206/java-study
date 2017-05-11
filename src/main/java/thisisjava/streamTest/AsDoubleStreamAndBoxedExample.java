package thisisjava.streamTest;

import java.util.Arrays;

public class AsDoubleStreamAndBoxedExample {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        Arrays.stream(intArray)
                .asDoubleStream()
                .forEach(System.out::println);
        System.out.println();

        Arrays.stream(intArray)
                .boxed()
                .forEach(System.out::println);
    }

}
