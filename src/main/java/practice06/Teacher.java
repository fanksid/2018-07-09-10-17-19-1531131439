package practice06;

import java.util.Objects;

public class Teacher extends Person {
    private Integer klass;

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + fetchKlass() + ".";
    }

    private String fetchKlass() {
        if (Objects.nonNull(klass)) {
            return "Class " + klass;
        }
        return "No Class";
    }
}
