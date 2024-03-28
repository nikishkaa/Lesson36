package by.itstep.goutor.javalesson.lesson36;

public class ObjectBox {
    private Object value;

    public ObjectBox() {
    }

    public ObjectBox(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
