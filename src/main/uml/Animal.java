package main.java.ex.uml;

public abstract class Animal {
    protected int legs; // 모든 동물의 다리 수

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("This animal walks on " + legs + " legs.");
    }

}
