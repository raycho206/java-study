package thisisjava.lambdaTest;

import java.util.function.Consumer;

public class ConsumerAndThenExample {

    public static void main(String[] args) {
        Consumer<Member> consumerA = m -> System.out.println("consumerA: " + m.getName());
        Consumer<Member> consumerB = m -> System.out.println("consumerB: " + m.getId());
        Consumer<Member> consumerAB = consumerA.andThen(consumerB);
//        return (T t) -> { accept(t); after.accept(t); };
        consumerAB.accept(new Member("홍길동", "hong", null));

        System.out.println();
        Consumer<Member> consumerC = new Consumer<Member>() {
            @Override
            public void accept(Member member) {
                System.out.println("consumerC");
            }
        };
        Consumer<Member> consumerD = new Consumer<Member>() {
            @Override
            public void accept(Member member) {
                System.out.println("consumerD");
            }
        };
        Consumer<Member> consumerCD = consumerC.andThen(consumerD);
        consumerCD.accept(new Member("", "", null));
    }

}
