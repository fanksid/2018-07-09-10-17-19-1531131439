package practice07;

public class Klass {
    private Integer number;

    public Klass(Integer number) {

        this.number = number;
    }

    Integer getNumber() {
        return number;
    }

    String getDisplayName() {
        return "Class " + number;
    }
}
