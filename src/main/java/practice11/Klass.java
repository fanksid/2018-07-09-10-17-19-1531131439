package practice11;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.Observable;

public class Klass extends Observable {
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
            setChanged();
            notifyObservers("I know " + student.getName() + " become Leader of Class " + number + ".");
            return;
        }

        System.out.println("It is not one of us.");
    }

    void appendMember(Student student) {
        members.add(student);
        setChanged();
        notifyObservers("I know " + student.getName() + " has joined Class " + number + ".");
    }

    boolean isIn(Student student) {
        return Objects.equals(this, student.getKlass());
    }
}
