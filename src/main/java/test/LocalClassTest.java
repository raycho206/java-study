package test;

public class LocalClassTest {

    void method() {
        int a;
        final int b;

        class LocalClass {
            public int c;
            protected int d;
            int e;
            private int f;

            void localMethod() {
                c = 1;
                d = 2;
                e = 3;
                f = 4;
            }
        }
    }

}
