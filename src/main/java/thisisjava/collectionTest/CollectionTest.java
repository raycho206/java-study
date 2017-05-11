package thisisjava.collectionTest;

import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionTest {

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        list.add("가");
        list.add("나");
        list.add("가");
        list.add("다");
        list.add("나");

//        print(list);
//        list.remove("가");
//        print(list);

        List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");

        List<String> vector = new Vector<>();

        List<String> linkedList = new LinkedList<>();

        Set<String> set = new HashSet<>();


        String path = CollectionTest.class.getResource("database.properties").getPath();
        path = URLDecoder.decode(path, "utf-8");
        Properties properties = new Properties();
        properties.load(new FileReader(path));

        List<String> syncronizedList = Collections.synchronizedList(list);

        Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
    }

    private static <E> void print(List<E> collections) {
        System.out.println("===============================");
        for (E e : collections) {
            System.out.println(e);
        }
        System.out.println("===============================");
    }

}
