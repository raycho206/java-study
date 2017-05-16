package test;

public interface AnimalInterface {
//    private String name;

//    AnimalAbstract() {
//
//    }

//    AnimalAbstract(String name) {
//        this.name = name;
//    }

    abstract void sound();

    abstract void abstractMethod();

    default void setName(String name) {
//        this.name = name;
    }

    public static void staticMethod() {

    }

}
