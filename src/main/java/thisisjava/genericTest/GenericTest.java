package thisisjava.genericTest;

public class GenericTest {

    public static void main(String[] args) {
//        Box<String> box1 = new Box<String>();
//        box1.set("hello");
//        System.out.println(box1.get());
//
//        Box<Integer> box2 = new Box<>();
//        box2.set(1);
//        System.out.println(box2.get());

//        Box<Integer> box1 = Util.boxing(100);
//        System.out.println(box1.get());

        Integer integer = new Integer(3);
        int intValue = integer;
        intValue = integer;

    }

    private static class Util {
        static <T> Box<T> boxing(T t) {
            Box<T> box = new Box<>();
            box.set(t);

            return box;
        }
    }

    private static class Box<T> {
        private T t;

        T get() {
            return t;
        }

        void set(T t) {
            this.t = t;
        }
    }

}
