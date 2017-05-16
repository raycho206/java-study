package thisisjava.nestedTest;

public class Outer {
    String field = "Outer field";

    void method() {
        System.out.println("Outer myFuncMethod");
    }

    public void method(int arg) {
        int localVariable = 1;

        class Inner {
            public void innerMethod() {
                int result = arg + localVariable;
            }
        }
    }

    class Nested {
        String field = "Inner field";

        void method() {
            System.out.println("Inner myFuncMethod");
            this.field = "";
            this.method();
            Outer.this.field = "";
            Outer.this.method();
        }

    }

}
