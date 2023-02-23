package bsu.comp152;

import org.w3c.dom.css.Rect;

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
    public Rectangle(double len, double wid){
        length = len;
        width = wid;
    }

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




}
