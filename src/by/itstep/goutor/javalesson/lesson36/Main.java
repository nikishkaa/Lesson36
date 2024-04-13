package by.itstep.goutor.javalesson.lesson36;

public class Main {
    public static void main(String[] args) {
        Box<String> sbox = new Box<String>(); // before JDK 7.0
        sbox.setValue("esfd");
//        sbox.setValue(5);
        String s1 = sbox.getValue();

        Box<Integer> integerBox = new Box<>(); // after JDK 7.0

//        A a = new B();
//        System.out.println(a instanceof C);
//        System.out.println(a instanceof B);
//        System.out.println(a instanceof A);
//        System.out.println(a instanceof Object);

        Box box1 = new Box();
        box1.setValue(10);
//        int n = box1.getValue();
        System.out.println(box1);

        BoxA aBox = new BoxA();

        ObjectBox box = new ObjectBox();
        box.setValue(15);
        box.setValue("asfd");
        box.setValue(new A());
        box.setValue(10);
        //A a = (A)box.getValue();

        Object o = box.getValue();

        if (o instanceof String s) {
            System.out.println(s + s);
        } else if (o instanceof Integer) {
            int n = (int) o;
            System.out.println(n * n);
        } else if (o instanceof A) {
            A a = (A) o;
            System.out.println(a);
        }


    }
}
