package practice10;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;

public class Klass {
    private Integer number;

    private Student leader;

    private List<Student> members = Lists.newArrayList();

    public Klass(Integer number) {
        this.number = number;
    }

    Integer getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    Student getLeader() {
        return leader;
    }

    void assignLeader(Student student) {
        if (members.contains(student)) {
            this.leader = student;
        }

        System.out.println("It is not one of us.");
    }

    void appendMember(Student student) {
        members.add(student);
    }

    boolean isIn(Student student) {
        return Objects.equals(this, student.getKlass());
    }
}
