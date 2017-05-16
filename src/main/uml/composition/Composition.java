package uml.composition;

public class Composition {

    private static class Person {
        private Heart heart;

        public Person() {
            heart = new Heart();
        }

        public String beating(int num) {
            return null;
        }
    }

    private static class Heart {

    }

    public static void main(String[] args) {
        Person person = new Person();
        person = null;
    }

}
