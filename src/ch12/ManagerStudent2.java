package ch12;

public class ManagerStudent2 {
    public static void main(String[] args) {
        ManagerStudent2 managerStudent2 = new ManagerStudent2();
        managerStudent2.checkEquals();
    }

    public void checkEquals() {
        Student2 student1 = new Student2("Park", "Seoul", "010xxxxxxxx", "hi@godofjava.com");
        Student2 student2 = new Student2("Park", "Seoul", "010xxxxxxxx", "hi@godofjava.com");
        if (student2.equals(student1)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
