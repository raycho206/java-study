package thisisjava.interfaceTest;

public class InterfaceTestMain {

    public static void main(String[] args) {
        Television tv = new Television();
        tv.turnOn();
        Audio audio = new Audio() {
            @Override
            public void setVolume(int volume) {

            }
        };

        RemoteControl rc = new Television();
        rc.turnOn();

        RemoteControl anonymityRc = new RemoteControl() {
            private String anonymity;

            protected void anonymityMethod() {

            }

            @Override
            public void turnOn() {

            }

            @Override
            public void turnOff() {

            }

            @Override
            public void setVolume(int volume) {

            }
        };

        RemoteControl anonymityRc2 = new RemoteControl() {
            @Override
            public void turnOn() {

            }

            @Override
            public void turnOff() {

            }

            @Override
            public void setVolume(int volume) {

            }
        };


    }

}
