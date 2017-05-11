package thisisjava.genericTest;

public class CompareMethodExample {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "사과");
        Pair<Integer, String> p2 = new Pair<>(1, "사과");
        boolean result1 = Util.compare(p1, p2);
        if (result1) {
            System.out.println("논리적으로 동등한 객체입니다.");
        } else {
            System.out.println("논리적으로 동등하지 않은 객체입니다.");
        }

        Pair<String, String> p3 = new Pair<>("user1", "홍길동");
        Pair<String, String> p4 = new Pair<>("user2", "홍길동");
        boolean result2 = Util.compare(p3, p4);
        if (result2) {
            System.out.println("논리적으로 동등한 객체입니다.");
        } else {
            System.out.println("논리적으로 동등하지 않은 객체입니다.");
        }
    }

    private static class Util {
        public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
            boolean keyCompare = p1.getKey().equals(p2.getKey());
            boolean valueCompare = p1.getValue().equals(p2.getValue());

            return keyCompare && valueCompare;
        }
    }

    private static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

}
