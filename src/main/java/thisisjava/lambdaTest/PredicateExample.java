package thisisjava.lambdaTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    private static List<Student> list = Arrays.asList(
            new Student("홍길동", "남자", 90),
            new Student("김순희", "여자", 90),
            new Student("감자바", "남자", 95),
            new Student("박한나", "여자", 92)
    );

    public static void main(String[] args) {
        double maleAvg = avg(t -> t.getGender().equals("남자"));
        System.out.println("남자 평균 점수: " + maleAvg);

        double femaleAvg = avg(t -> t.getGender().equals("여자"));
        System.out.println("여자 평균 점수: " + femaleAvg);
    }

    private static double avg(Predicate<Student> predicate) {
        int sum = 0, count = 0;
        for (Student student : list) {
            if (predicate.test(student)) {
                sum += student.getScore();
                count++;
            }
        }

        return (double) sum / count;
    }

}
