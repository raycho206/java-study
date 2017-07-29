package thisisjava.streamTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {

    public static void main(String[] args) {
        List<Member> memberList = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        List<Member> developerList = memberList.stream()
                .filter(m -> m.getJob().equals("개발자"))
                .collect(Collectors.toList());

        developerList.stream().forEach(m -> System.out.println(m.getName()));
    }

}
