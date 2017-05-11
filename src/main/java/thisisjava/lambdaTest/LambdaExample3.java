package thisisjava.lambdaTest;

import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class LambdaExample3 {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("신용권", 95, 93)
    };

    public static void main(String[] args) {
        double englishAvg = avg(Student::getEnglishScore);
//        double englishAvg = avg(s -> s.getEnglishScore());
        System.out.println("영어 점수 평균: " + englishAvg);

        double mathAvg = avg(Student::getMathScore);
//        double mathAvg = avg(s -> s.getMathScore());
        System.out.println("수학 점수 평균: " + mathAvg);
    }

    private static double avg(ToIntFunction<Student> function) {
        int sum = 0;
        for (Student student : students) {
            sum += function.applyAsInt(student);
        }

        return (double) sum / students.length;
    }

    private static double avg(ToIntBiFunction<String, String> function) {
        return 0;
    }

}
