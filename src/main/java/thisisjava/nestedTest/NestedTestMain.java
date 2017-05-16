package thisisjava.nestedTest;

public class NestedTestMain {

    public static void main(String[] args) {
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };

        A a = new A();

        // 인스턴스 멤버 클래스 객체 생성
        A.B b = a.new B();
        b.field1 = 1;
        b.method1();

        // 정적 멤버 클래스 객체 생성
        A.C c = new A.C();
        c.field1 = 2;
        c.method1();
        A.C.field2 = 2;
        A.C.method2();

        // 로컬 클래스 객체 생성을 위한 메소드 호출
        a.method();

    }

}
