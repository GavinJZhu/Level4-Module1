package _02_Intro_To_Abstract_Classes_and_Interfaces;

/*
 * 1. Create a class that extends the AbstractClassDemo class and implement its
 * methods.
 */
public class AbstractClassDemoTest extends AbstractClassDemo implements InterfaceDemo, DemoInterface {
    public static void main(String[] args) {}

    @Override
    public void abstractDemo() {
        
    }
    @Override
    public int abstractNumDemo() {
        return 0;
    }

    @Override
    public double interDemo() {
        return 0;
    }

    @Override
    public String faceDemo() {
        return "";
    }
}
