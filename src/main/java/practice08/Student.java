package practice08;

import java.util.Objects;

public class Student extends Person {
    private Klass klass;

    public Student(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public Student(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Student. I am " + findKlassInfo() + ".";
    }

    private String findKlassInfo() {
        if (Objects.equals(this, klass.getLeader())) {
            return "Leader of " + klass.getDisplayName();
        }
        return "at " + klass.getDisplayName();
    }
}
