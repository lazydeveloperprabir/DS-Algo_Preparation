public interface intferface {
    void show();

    default void log() {
        System.out.println("Hello from log");
    }
}

/**
 * Innerintferface
 */
interface intferface1 {
    void display();

    default void log1() {
        System.out.println("hello");
    }
}

class Demo implements intferface, intferface1 {

    @Override
    public void display() {
        // TODO Auto-generated method stub

    }

    @Override
    public void show() {
        // TODO Auto-generated method stub

    }

    @Override
    public void log1() {
        System.out.println("hi");
    }
}