package bsu.comp152;

/**
 * Is a (container) class for the Java program we run. It contains a main method with client code (a driver program) to create and manipulate Rectangle objects.
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Create a Rectangle object.
         * Call it rect.
         * Do an inline initialization of a Rectangle object.
         * We instantiate the Rectangle class.
         * We are creating an instance of the Rectangle class.
         *
         * There is a default constructor that takes 0 arguments.
         * However, it is no longer available after we write our own constructor in the Rectangle class.
         */
        // Rectangle rect = new Rectangle();

        Rectangle rect = new Rectangle(5.4, 3.0);
        System.out.println(rect);
        System.out.println(rect.getLength());
        System.out.println(rect.getWidth());
        rect.setLength(12.2);
        System.out.println(rect.getLength());
        rect.setWidth(9.17);
        System.out.println(rect.getWidth());
        /*
         * Calling toString explicitly is not necessary.
         */
        System.out.println(rect.toString());
        /*
         * There is an implicit call to toString.
         */
        System.out.println(rect);
        /*
         * The most useful toString method will be called: the one we wrote in the Rectangle class, rather than the memory address.
         */
        Rectangle rect2 = new Rectangle(12.2, 9.17);
        System.out.println(rect.equals(rect2));
    }
}