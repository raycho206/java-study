package thisisjava.lambdaTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class FunctionExample2 {

    private static List<Student> list = Arrays.asList(
            new Student("홍길동", 90, 96),
            new Student("신용권", 95, 93)
    );

    public static void main(String[] args) {
        double englishAvg = avg(s -> s.getEnglishScore());
        System.out.println("영어 평균 점수: " + englishAvg);

        double mathAvg = avg(s -> s.getMathScore());
        System.out.println("수학 평균 점수: " + mathAvg);
    }

    private static double avg(ToDoubleFunction<Student> function) {
        double sum = 0;
        for (Student student : list) {
            sum += function.applyAsDouble(student);
        }

        return sum / list.size();
    }

}
