package main.java.kata;

import java.util.Arrays;

/**
 * Sum without highest and lowest number
 * https://www.codewars.com/kata/sum-without-highest-and-lowest-number/train/java
 */
public class SumWithoutHighestAndLowestNumber2 {

    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        if (numbers.length == 1) {
            return 0;
        }
        int sum = 0;
        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }
        return sum;
    }

}
