package practice08;

public class Klass {
    private Integer number;

    private Student leader;

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
        this.leader = student;
    }
}
