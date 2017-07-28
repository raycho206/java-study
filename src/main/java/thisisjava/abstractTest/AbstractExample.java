package thisisjava.abstractTest;

public class AbstractExample {

    static abstract class Phone {
        String owner;

        Phone(String owner) {
            this.owner = owner;
        }

        void turnOn() {
            System.out.println("Phone 전원을 켭니다.");
        }

        void turnOff() {
            System.out.println("Phone 전원을 끕니다.");
        }
    }

    static class SmartPhone extends Phone {
        public SmartPhone(String owner) {
            super(owner);
        }
    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.turnOn();
    }

}
