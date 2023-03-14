package bsu.comp152;

/**
 * Is a (blueprint) class for creating and manipulating Rectangle objects.
 */
public class Rectangle {

    // Declare instance variables at the top of the class.
    // Instance variables are in contrast to static variables.
    private double length;
    private double width;
    // These capture the data associated with Rectangle objects.

    // Define instance methods.
    /*
     * Accessors (getters) return information about the rectangle.
     * Mutators (setters) set (modify) information associated with the rectangles.
     */

    /*
     * A constructor has the same name as the class.
     * A constructor is public.
     * A constructor has no return type, not even void!
     */

    /*
     * Methods (including constructors) can be overloaded:
     * You can write multiple methods that have the same name,
     * as long as the "signatures" are different.
     * The signature consists of the method's name and the types of the parameters, in the order in which they appear.
     * (The method's return type is not part of the signature.)
     */
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(){
        length = 0.0;
        width = 0.0;
    }

    public Rectangle(Rectangle original){
        length = original.length;
        width = original.width;
    }

    /*
     * The Rectangle class has (public) "instance methods",
     * e.g., getLength, getWidth, setLength.
     * Accessors (getters) return information about the rectangle.
     * Mutators (setters) set (modify) information associated with the rectangle.
     */

    /**
     * A getter (accessor)
     * @return the length of the rectangle
     */
    public double getLength(){
        return length;
    }


    public double getWidth(){
        return width;
    }

    public boolean isSquare(){
        return length == width;
    }

    public double getArea(){
        return length*width;
    }

    @Override
    public String toString(){
        return String.format("Rectangle: length %f, width %f", length, width);
    }



    public boolean equals(Rectangle other){
        return (length == other.length) && (width == other.width);
    }

    /**
     * A setter (mutator)
     * @param len the value to use for the length
     */
    public void setLength(double len){
        length = len;
    }

    public void setWidth(double wid){
        width = wid;
    }

    public Rectangle copy(){
        Rectangle r = new Rectangle(length, width);
        return r;
    }

    public void rotate(){
        double temp = length;
        length = width;
        width = temp;
    }
}
