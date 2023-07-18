package ch9.c.inheritance;

public class Dog extends Animal{
    @Override
    public void move() {
        System.out.println("Dog move");
    }

    @Override
    public void eatFood() {
        System.out.println("Dog eats food");
    }
}
