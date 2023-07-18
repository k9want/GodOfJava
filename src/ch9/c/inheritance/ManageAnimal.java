package ch9.c.inheritance;

public class ManageAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
        Dog dog = new Dog();
        dog.move();
        Cat cat = new Cat();
        cat.move();
    }
}
