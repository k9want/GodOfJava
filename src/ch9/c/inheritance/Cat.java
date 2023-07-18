package ch9.c.inheritance;

public class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("Cat move");
    }

    @Override
    public void eatFood() {
        System.out.println("Cat eats food");
    }
}
