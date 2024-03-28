package by.itstep.goutor.javalesson.lesson36;

public class BoxA {
    private A value;

    public BoxA() {
    }

    public BoxA(A value) {
        this.value = value;
    }

    public A getValue() {
        return value;
    }

    public void setValue(A value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
