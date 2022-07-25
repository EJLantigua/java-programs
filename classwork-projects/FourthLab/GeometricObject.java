public class GeometricObject {
    //Data Fields
    private String color = "black";
    private boolean filled;

    //Default Geometric Object constructor
    public GeometricObject(){}

    //Geometric Object constructor with parameters
    public GeometricObject(String mColor, boolean mFilled){
        this.color = mColor;
        this.filled = mFilled;
    }

    //Set a different color
    public void setColor(String mColor){
        this.color = mColor;
    }

    //Set if filled
    public void setFilled(boolean mFilled) {
        this.filled = mFilled;
    }

    //Get color
    public String getColor(){
        return color;
    }

    //Get filled
    public boolean getFilled(){
        return filled;
    }

    //Return String representation of this object
    public String toString(){
        return "Color: " + this.color + "\nFilled: " + this.filled;
    }
}
