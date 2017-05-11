package test;

public abstract class AnimalAbstract {
    private String name;

    protected AnimalAbstract() {

    }

    AnimalAbstract(String name) {
        this.name = name;
    }

    abstract void sound();

    void setName(String name) {
        this.name = name;
    }

}
