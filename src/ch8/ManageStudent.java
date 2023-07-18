package ch8;

public class ManageStudent {
    public static void main(String[] args) {
        Student[] student = null;
        ManageStudent manageStudent = new ManageStudent();
        student = manageStudent.addStudent();
        manageStudent.printStudents(student);

    }

    public Student[] addStudent() {
        Student[] student = new Student[3];
        student[0] = new Student("Lee");
        student[1] = new Student("Kim");
        student[2] = new Student("Park", "Seoul", "010XXXXXXXX", "hello@godofjava.com");
        return student;
    }

    public void printStudents(Student[] student) {
        for (Student s : student) {
            System.out.println(s);
        }
    }
}
