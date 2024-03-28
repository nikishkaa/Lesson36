package by.itstep.goutor.javalesson.lesson36;

public class FloatBox {
    private float value;

    public FloatBox() {
    }

    public FloatBox(float value) {
        this.value = value;
    }

    public float getValue() {
        return  value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
