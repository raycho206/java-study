package thisisjava.streamTest;

import java.util.Arrays;
import java.util.List;

public class StreamExample2 {

    public static void main(String[] args) {
        List<Member> memberList = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)

        );

        double avg = memberList.stream()
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();

        System.out.println("평균 나이: " + avg);
    }

}
