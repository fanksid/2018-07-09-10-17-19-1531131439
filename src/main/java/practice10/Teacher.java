package practice10;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

public class Teacher extends Person {
    private List<Klass> classes;

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public Teacher(Integer id, String name, Integer age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    List<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + findKlassInfo() + ".";
    }

    private String findKlassInfo() {
        if (Objects.isNull(classes) || classes.size() == 0) {
            return "No Class";
        }
        return "Class " + getClassSum();
    }

    private String getClassSum() {
        List<Integer> classNumbers = classes.stream().map(Klass::getNumber).collect(Collectors.toList());
        return StringUtils.join(classNumbers, ", ");
    }

    String introduceWith(Student student) {
        return super.introduce() + " I am a Teacher. " + findTeachStudentInfo(student) + ".";
    }

    private String findTeachStudentInfo(Student student) {
        if (classes.contains(student.getKlass())) {
            return "I teach " + student.getName();
        }
        return "I don't teach " + student.getName();
    }

    boolean isTeaching(Student student) {
        return classes.stream().anyMatch(c -> c.isIn(student));
    }
}

