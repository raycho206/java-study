package thisisjava.streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    static int sum = 0;

    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "신용권", "감자바");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
//            System.out.println(name);
        }
        System.out.println();

        Stream<String> stream = list.stream();
//        stream.forEach(name -> System.out.println(name));
//        stream.forEach(System.out::println);

        String[] strArrays = {"홍길동", "신용권", "김미나"};
        Arrays.stream(strArrays);
        Stream.of(strArrays);

        IntStream intStream = IntStream.range(1, 100);
//        IntStream intStream = IntStream.rangeClosed(1, 100);
        intStream.forEach(a -> sum += a);
//        System.out.println("총합: " + sum);

        List<Integer> emptyList = new ArrayList<>();
        double avgOfEmptyList = emptyList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        System.out.println("평균: " + avgOfEmptyList);
    }

}
