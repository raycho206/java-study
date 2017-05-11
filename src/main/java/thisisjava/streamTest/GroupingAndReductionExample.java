package thisisjava.streamTest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingAndReductionExample {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 10, Student.Sex.MALE),
                new Student("김수애", 12, Student.Sex.FEMALE),
                new Student("신용권", 10, Student.Sex.MALE),
                new Student("박수미", 12, Student.Sex.FEMALE)
        );

        // 학생들을 성별로 그룹핑한 다음 같은 그룹에 속하는 학생들의 평균 점수를 구하고,
        // 성별을 키로, 평균 점수를 값으로 갖는 Map을 생성
        Map<Student.Sex, Double> mapBySex = studentList.stream()
                .collect(Collectors.groupingBy(
                        Student::getSex,
                        Collectors.averagingDouble(Student::getScore)));
        System.out.println("남학생 평균 점수: " + mapBySex.get(Student.Sex.MALE));
        System.out.println("여학생 평균 점수: " + mapBySex.get(Student.Sex.FEMALE));

        System.out.println();

        // 학생들을 성별로 그룹핑한 다음 같은 그룹에 속하는 학생 이름을 쉼표로 구분해서 문자열로 만들고,
        // 성별을 키로, 이름 문자열을 값으로 갖는 Map을 생성
        Map<Student.Sex, String> mapByName = studentList.stream()
                .collect(Collectors.groupingBy(
                        Student::getSex,
                        Collectors.mapping(Student::getName, Collectors.joining(","))
                ));
        System.out.println("남학생 전체 이름: " + mapByName.get(Student.Sex.MALE));
        System.out.println("여학생 전체 이름: " + mapByName.get(Student.Sex.FEMALE));

//        Stream<Student> studentStream = studentList.stream();
//
//        Function<Student, Student.Sex> classifier = Student::getSex;
//
//        ToDoubleFunction<Student> mapper = Student::getScore;
//        Collector<Student, ?, Double> collector1 = Collectors.averagingDouble(mapper);
//
//        Collector<Student, ?, Map<Student.Sex, Double>> collector2 =
//                Collectors.groupingBy(classifier, collector1);
//
//        Map<Student.Sex, Double> mapBySex = studentStream.collect(collector2);

    }

}
