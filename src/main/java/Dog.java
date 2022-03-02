public class Dog {
    private String name;
    private double length;  // length in inches

    /**
     * Constructs a Dog with a default name of C3PO that is
     * 25.4 inches long.
     */
    public Dog(){
        name = "C3PO";
        length = 25.4;
    }

    /**
     * Constructs a Dog with a name given by the parameter
     * name that is length long
     * @param name the name of this Dog
     * @param length the length of this Dog
     */
    public Dog(String name, double length){
        // TODO: replace this line with your code
    }

    /**
     * Returns the name of this Dog.
     * @return a String representing the name of this Dog
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the length of this Dog in inches
     * @return the length of this Dog in inches
     */
    public double getLengthInInches(){
        return length;
    }

    /**
     * Returns the length of this Dog in cm.
     * @return the length of this Dog in cm
     */
    public double getLengthInCentiMeters(){
        // use 1in = 2.54cm
        // TODO: replace this line with your code
    }

    /**
     * Sets the name of this Dog
     * @param name a string representing the new name of this Dog
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Sets the new length of this Dog in inches
     * @param length the new length of this Dog in inches
     */
    public void setLength(double length) {
        // TODO: replace this line with your code
    }

    //===================== Do not touch code below this line =================
    /**
     * Converts this Dog to a string representation.
     * @return a String representing this Dog.
     */
    public String toString(){
        return name+":"+length;
    }
}
