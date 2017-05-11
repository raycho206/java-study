package thisisjava.streamTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class ReductionExample {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 92),
                new Student("신용권", 95),
                new Student("감자바", 88)
        );

        int sum1 = studentList.stream()
                .mapToInt(Student::getScore)
                .sum();

        int sum2 = studentList.stream()
                .map(Student::getScore)
                .reduce((a, b) -> a + b)
                .get();

        int sum3 = studentList.stream()
                .map(Student::getScore)
                .reduce(0, (a, b) -> a + b);

        String name = studentList.stream()
                .map(Student::getName)
                .reduce(new BinaryOperator<String>() {
                    @Override
                    public String apply(String s, String s2) {
                        return s + s2;
                    }
                })
                .get();

        Stream<Student> studentStream = studentList.stream();
        Stream<Integer> integerStream = studentStream.map(new Function<Student, Integer>() {
            @Override
            public Integer apply(Student student) {
                return student.getScore();
            }
        });
        int sum5 = integerStream.reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });

        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);
        System.out.println("sum3: " + sum3);
        System.out.println("name: " + name);
        System.out.println("sum5: " + sum5);
    }

}
