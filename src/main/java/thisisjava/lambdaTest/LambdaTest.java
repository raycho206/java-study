package thisisjava.lambdaTest;

import java.util.function.*;

public class LambdaTest {

    public static void main(String[] args) {
//        MyFunctionalInterface myFunc1 = (x, y) -> {
//            System.out.println("MyFunctionalInterface - myFuncMethod() call");
//
//            return x + y;
//        };
//        int methodValue = myFunc1.myFuncMethod(5, 2);
//        System.out.println(methodValue);
//
//        MyFunctionalInterface myFunc2 = (x, y) -> 0;

//        UsingThis usingThis = new UsingThis();
//        UsingThis.Inner inner = usingThis.new Inner();
//        inner.method1();
//        System.out.println("=========");
//        inner.method2();

//       UsingLocalVariable ulv = new UsingLocalVariable();
//       ulv.method(20);

//        Thread thread = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println(i);
//            }
//        });
//        Runnable runnable = () -> {
//            System.out.println("runnable");
//        };

//        Consumer<String> consumer = t -> System.out.println(t + 8);
//        BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
//        DoubleConsumer doubleConsumer = System.out::println;
//        ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
//        consumer.accept("java");
//        biConsumer.accept("java", "8");
//        doubleConsumer.accept(8.0);
//        objIntConsumer.accept("java", 8);

//        Supplier<String> supplier = () -> "java8";
//        IntSupplier intSupplier = () -> 8;
//        supplier.get();
//        intSupplier.getAsInt();

        Function<String, Integer> function = t -> Integer.parseInt(t);
        function.apply("8");
        ToIntFunction<String> toIntFunction = t -> Integer.parseInt(t);
        toIntFunction.applyAsInt("88");

    }

    private static class UsingLocalVariable {
        void method(int arg) {
            int localVar = 40;

            arg = 1;
//            localVar = 4;

            int finalArg = arg;
            MyFunctionalInterface myFunc = () -> {
                System.out.println("arg: " + finalArg);
                System.out.println("localVar: " + localVar);
            };
            myFunc.myFuncMethod();
        }
    }

    private static class UsingThis {
        public int outerField = 10;

        class Inner {
            int innerField = 20;

            void method1() {
                MyFunctionalInterface myFunc = new MyFunctionalInterface() {
                    @Override
                    public void myFuncMethod() {
                        outerField = 0;
                        innerField = 2;
                        System.out.println(UsingThis.this.outerField);
                        System.out.println(Inner.this.innerField);
                    }
                };
                myFunc.myFuncMethod();
            }

            void method2() {
                MyFunctionalInterface myFunc2 = () -> {
                    outerField = 1;
                    innerField = 3;
                    System.out.println(UsingThis.this.outerField);
                    System.out.println(this.innerField);
                };
                myFunc2.myFuncMethod();
            }
        }
    }

    @FunctionalInterface
    private interface MyFunctionalInterface {
        void myFuncMethod();
//        int myFuncMethod(int x, int y);
    }

}
