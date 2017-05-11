package thisisjava.apiTest;

public class KeyExample {

    public static void main(String[] args) {
        Key key1 = new Key(1);
        Key key2 = new Key(1);

        System.out.println(key1);
        System.out.println(key2);
        System.out.println(new Key(1));
        System.out.println(new Key(1));
    }

    public static class Key {
        public int number;

        public Key(int number) {
            this.number = number;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Key) {
                Key compareKey = (Key) obj;
                if (this.number == compareKey.number) {
                    return true;
                }
            }

            return false;
        }
    }

}
