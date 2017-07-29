package thisisjava.streamTest;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expression",
                "Java8 supports lambda expression"
        );

        list.stream()
                .filter(s -> s.toLowerCase().contains("java"))
                .forEach(System.out::println);
    }

}
