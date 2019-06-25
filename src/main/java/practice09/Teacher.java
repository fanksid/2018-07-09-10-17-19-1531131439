package practice09;

import java.util.Objects;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public Teacher(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + findKlassInfo() + ".";
    }

    private String findKlassInfo() {
        if (Objects.isNull(klass)) {
            return "No Class";
        }
        return klass.getDisplayName();
    }

    String introduceWith(Student student) {
        return super.introduce() + " I am a Teacher. " + findTeachStudentInfo(student) + ".";
    }

    private String findTeachStudentInfo(Student student) {
        if (Objects.equals(student.getKlass(), klass)) {
            return "I teach " + student.getName();
        }
        return "I don't teach " + student.getName();
    }
}

