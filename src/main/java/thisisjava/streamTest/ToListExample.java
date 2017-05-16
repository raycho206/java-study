package thisisjava.streamTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ToListExample {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 10, Student.Sex.MALE),
                new Student("김수애", 6, Student.Sex.FEMALE),
                new Student("신용권", 10, Student.Sex.MALE),
                new Student("박수미", 6, Student.Sex.FEMALE)
        );

        // 남학생들만 묶어 List 생성
        List<Student> maleList = studentList.stream()
                .filter(new Predicate<Student>() {
                    @Override
                    public boolean test(Student student) {
                        return student.getSex() == Student.Sex.MALE;
                    }
                })
                .collect(Collectors.toList());
        maleList.stream()
                .forEach(new Consumer<Student>() {
                    @Override
                    public void accept(Student student) {
                        System.out.println(student.getName());
                    }
                });
        System.out.println();

        // 여학생들만 묶어 HashSet 생성
        Set<Student> femaleSet = studentList.stream()
                .filter(s -> s.getSex() == Student.Sex.FEMALE)
                .collect(Collectors.toCollection(HashSet::new));
//                .collect(Collectors.toSet());
        femaleSet.stream()
                .forEach(s -> System.out.println(s.getName()));
    }

}
