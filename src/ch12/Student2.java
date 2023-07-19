package ch12;

public class Student2 {
    String name;
    String address;
    String phone;
    String email;

    public Student2(String name) {
        this.name = name;
    }

    public Student2(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return name + " " + address + " " + phone + " " + email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Student2 objStudent = (Student2) obj;
        if (name == null) {
            if (objStudent.name != null) {
                return false;
            }
        } else if (!name.equals(objStudent.name)) {
            return false;
        }
        if (email == null) {
            if (objStudent.email != null) {
                return false;
            }
        } else if (!email.equals(objStudent.email)) {
            return false;
        }
        if (address == null) {
            if (objStudent.address != null) {
                return false;
            }
        } else if (!address.equals(objStudent.address)) {
            return false;
        }
        if (phone == null) {
            if (objStudent.phone != null) {
                return false;
            }
        } else if (!phone.equals(objStudent.phone)) {
            return false;
        }


        return true;
    }
}
