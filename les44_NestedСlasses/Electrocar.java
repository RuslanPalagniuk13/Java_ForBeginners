public class Electrocar {
    private int id;

    // вложенный нестатический класс
    private class Motor {
        public void startMotor(){
            System.out.println("Motor " + id + " is starting...");
        }
    }

    // статический вложенный класс
    public static class Battry {
        public void charge() {
            System.out.println("Battary is charging...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1;

        class SomeClass {
            public void some.Method() {
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someObject = new SomeClass();
        test(someObject);

        System.out.println("Electricar " + id + " is starting...");
    }

    private void test(Object object) {

    }

    public static Electrocar.Battry Battry() {
        return null;
    }
}
