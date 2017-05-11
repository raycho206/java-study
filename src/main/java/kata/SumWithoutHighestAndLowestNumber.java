package main.java.kata;

/**
 * Sum without highest and lowest number
 * https://www.codewars.com/kata/sum-without-highest-and-lowest-number/train/java
 */
public class SumWithoutHighestAndLowestNumber {

    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        if (numbers.length == 1) {
            return 0;
        }

        int min = numbers[0];
        int max = 0;
        int minIndex = 0;
        int maxIndex = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                maxIndex = i;
            }

            if (min > numbers[i]) {
                min = numbers[i];
                minIndex = i;
            }
        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);

        for (int i = 0; i < numbers.length; i++) {
            if (i != maxIndex && i != minIndex) {
                sum += numbers[i];
            }
        }
        System.out.println("sum: " + sum);

        return sum;
    }

}
