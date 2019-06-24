package practice07;

import java.util.Objects;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public Teacher(String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + findKlass() + ".";
    }

    private String findKlass() {
        if (Objects.isNull(klass)) {
            return "No Class";
        }
        return klass.getDisplayName();
    }

    String introduceWith(Student student) {
        return super.introduce() + " I am a Teacher. I" + ifTeach(student) + " teach " + student.getName() + ".";
    }

    private String ifTeach(Student student) {
        if (Objects.equals(klass, student.getKlass())) {
            return "";

        }
        return " don't";
    }
}
