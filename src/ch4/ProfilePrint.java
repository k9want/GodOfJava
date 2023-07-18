package ch4;

public class ProfilePrint {
    public static void main(String[] args) {
        ProfilePrint profilePrint = new ProfilePrint();

        byte age = 26;
        String name = "sangkwon";
        boolean isMarried=false;

        profilePrint.setAge(age);
        profilePrint.setName(name);
        profilePrint.setMarried(isMarried);

        System.out.println(profilePrint.getAge());
        System.out.println(profilePrint.getName());
        System.out.println(profilePrint.isMarried());
    }

    private byte age;
    private String name;
    private boolean isMarried;

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public boolean isMarried() {
        return isMarried;
    }
}
