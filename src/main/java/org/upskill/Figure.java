package org.upskill;

import java.util.Objects;

/**
 * TODO: Class that represents a Figure.
 */
public abstract class Figure {
    private String color;

    private static final String DEFAULT_COLOR = "blue";

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

    /**
     * Metodo abstrato, utilizado na classe Circulo e Rectângulo!
     * @return
     */
    public abstract double perimeter ();

    ///////////////////////////////////////////////////////////////////////////
    //                          Getters and Setters                          //
    ///////////////////////////////////////////////////////////////////////////

     /**
      * Get the value of color.
      * @return the value of color.
      */
     public String getColor() {
         return this.color;
     }

     /**
      * Set the value of color.
      * @param color the new value of color.
      */
     public void setColor(String color) {
         this.color = color;
     }
    
    ///////////////////////////////////////////////////////////////////////////
    //                                Methods                                //
    ///////////////////////////////////////////////////////////////////////////
    public abstract double area();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Figure)) return false;
        Figure figure = (Figure) o;
        return Objects.equals(color, figure.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
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
