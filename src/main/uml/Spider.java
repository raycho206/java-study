package main.java.ex.uml;

public class Spider extends Animal {

    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spiders catch flies in their webs to eat.");
    }

}
