va.lang.Math;

public class Triangle extends GeometricObject{
    //Data Fields
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    //Default constructor for Triangle
    public Triangle() {}

    //Constructor for Triangle with parameters for sides
    public Triangle(double s1, double s2, double s3){
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    //Constructor for Triangles w/ parameters for sides and inherited public methods
    public Triangle(double s1, double s2, double s3, String mColor, boolean mFilled){
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
        setColor(mColor);
        setFilled(mFilled);
    }

    //Next 3 methods to set values for triangle's sides
    public void setSide1(double s1){
        this.side1 = s1;
    }
    
    public void setSide2(double s2){
        this.side2 = s2;
    }
    
    public void setSide3(double s3){
        this.side3 = s3;
    }

    //Next 3 methods to get values for triangle's sides
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    //Get the Perimeter of a Triangle
    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    //Get Area of the Triangle
    public double getArea(){
        double Ph = getPerimeter()/2;
        return Math.sqrt(Ph * (Ph - side1) * (Ph - side2) * (Ph - side3));
    }

    //Polymorphism w/ toString method to tailor it to the Triangle method
    public String toString(){
        return "Triangle: side1= " + getSide1() + " side2 = " + getSide2() + " side3= " + getSide3();
    }

    //Display Triangle's information
    public void display(){
        System.out.print("Triangle's Information\nPerimeter: " +
        getPerimeter() + "\nArea: " + getArea() + "\nColor: " +
        getColor() + "\nFilled: " + getFilled());
    }
}

