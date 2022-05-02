package org.upskill;

/**
 * TODO: Class that represents a Figure.
 */
public abstract class Figure {
    private String color;

    private static final int DEFAULT_COLOR = "blue";

    ///////////////////////////////////////////////////////////////////////////
    //                              Constructors                             //
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * TODO: Create a new Figure with the default parameters.
     */
    public Figure() {
        this.color = DEFAULT_COLOR;
    }

    /**
     * TODO: Create a new Figure with the given parameters.
     * @param color color value.
     */
    public Figure(String color) {
        this.color = color;
    }

    ///////////////////////////////////////////////////////////////////////////
    //                          Getters and Setters                          //
    ///////////////////////////////////////////////////////////////////////////

    // /**
    //  * Get the value of color.
    //  * @return the value of color.
    //  */
    // public int getColor() {
    //     return this.color;
    // }

    // /**
    //  * Set the value of color.
    //  * @param color the new value of color.
    //  */
    // public void setColor(int color) {
    //     this.color = color;
    // }
    
    ///////////////////////////////////////////////////////////////////////////
    //                                Methods                                //
    ///////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////
    //                               Overrides                               //
    ///////////////////////////////////////////////////////////////////////////
    
    /**
     * Returns a string with the description of the Figure.
     * @return a string with the description of the Figure.
     */
    @Override
    public String toString() {
        // TODO: might need a super.toString()
        return String.format("Figure {"
                             + "Color: %s, "
                             + "}",
                             this.color);
    }

    /**
     * Compares Figure with another object to check if it's equal.
     * @param o object to compare with.
     * @return true if its equal or false if it's not equal.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Figure otherFigure = (Figure) o;
        return this.color == otherFigure.color;
    }

    /**
     * Creates a hashcode for Figure.
     * @return hashcode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.color);
    }

    // TODO: implements Comparable<Figure>
    // /**
    //  * Compares a Figure with another Figure.
    //  * @return negative if this instance is lesser than the other instance,
    //  * zero if it's equal or positive if it's greater.
    //  */
    // @Override
    // public int compareTo(Figure o) {
    //     return this.color - o.color;
    // }
    
    ///////////////////////////////////////////////////////////////////////////
    //                             Static Methods                            //
    ///////////////////////////////////////////////////////////////////////////
}
