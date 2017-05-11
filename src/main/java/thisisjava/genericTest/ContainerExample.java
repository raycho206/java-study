package thisisjava.genericTest;

public class ContainerExample {

    public static void main(String[] args) {
//        Container<String> container1 = new Container<>();
//        container1.set("홍길동");
//        String str = container1.get();
//        System.out.println(str);
//
//        Container<Integer> container2 = new Container<>();
//        container2.set(6);
//        int value = container2.get();
//        System.out.println(value);

        Container<String, String> container1 = new Container<>();
        container1.set("홍길동", "도적");
        String name1 = container1.getKey();
        String job = container1.getValue();
        System.out.println(name1 + ", " + job);

        Container<String, Integer> container2 = new Container<>();
        container2.set("홍길동", 35);
        String name2 = container2.getKey();
        int age = container2.getValue();
        System.out.println(name2 + ", " + age);
    }

    private static class Container<K, V> {
        private K key;
        private V value;

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void set(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

//    private static class Container<T> {
//        private T t;
//
//        public T get() {
//            return t;
//        }
//
//        public void set(T t) {
//            this.t = t;
//        }
//    }

}
