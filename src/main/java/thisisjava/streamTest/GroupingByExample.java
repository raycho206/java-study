package thisisjava.streamTest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByExample {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 10, Student.Sex.MALE, Student.City.SEOUL),
                new Student("김수애", 6, Student.Sex.FEMALE, Student.City.PUSAN),
                new Student("신용권", 10, Student.Sex.MALE, Student.City.PUSAN),
                new Student("박수미", 6, Student.Sex.FEMALE, Student.City.SEOUL)
        );

        Map<Student.Sex, List<Student>> mapBySex = studentList.stream()
                .collect(Collectors.groupingBy(Student::getSex));

        System.out.print("[남학생] ");
        mapBySex.get(Student.Sex.MALE).stream()
                .forEach(s -> System.out.print(s.getName() + " "));

        System.out.print("\n[여학생] ");
        mapBySex.get(Student.Sex.FEMALE).stream()
                .forEach(s -> System.out.print(s.getName() + " "));

        System.out.println();

        Map<Student.City, List<String>> mapByCity = studentList.stream()
                .collect(Collectors.groupingBy(Student::getCity,
                        Collectors.mapping(Student::getName, Collectors.toList())));

        System.out.print("\n[서울] ");
        mapByCity.get(Student.City.SEOUL).stream()
                .forEach(s -> System.out.print(s + " "));

        System.out.print("\n[부산] ");
        mapByCity.get(Student.City.PUSAN).stream()
                .forEach(s -> System.out.print(s + " "));

//        Stream<Student> studentStream = studentList.stream();
//
//        Function<Student, Student.City> classifier = Student::getCity;
//
//        Function<Student, String> mapper = Student::getName;
//        Collector<String, ?, List<String>> collector1 = Collectors.toList();
//        Collector<Student, ?, List<String>> collector2 =
//                Collectors.mapping(mapper, collector1);
//
//        Collector<Student, ?, Map<Student.City, List<String>>> collector3 =
//                Collectors.groupingBy(classifier, collector2);
//
//        Map<Student.City, List<String>> mapByCity = studentStream.collect(collector3);
    }

}
