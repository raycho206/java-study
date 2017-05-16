package thisisjava.streamTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class LambdaExpressionExample {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 90),
                new Student("신용권", 92)
        );

        Stream<Student> stream = list.stream();
        stream.forEach(s -> {
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + "-" + score);
        });
//        stream.forEach(new Consumer<Student>() {
//            @Override
//            public void accept(Student student) {
//
//            }
//        });
    }

}
