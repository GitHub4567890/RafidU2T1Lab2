// Rectangle class definition
public class Rectangle {

    // instance variables
    private int length;
    private int width;

    // constructor method for creating Rectangle objects;
    // instance variables are set here using the values passed as arguments
    public Rectangle(int len, int wid) {
        length = len;
        width = wid;
    }

    // method that calculates and returns area
    public int calculateArea() {
        return length * width;
    }

    // method that calculates and prints area
    public void printArea() {
        int area = length * width;
        System.out.println("My area is " + area);
    }

    // method that calculates and returns volume
    // of a box with length, width, and height
    public double calculateBoxVolume(double height) {
        return length * width * height;
    }

    // method that calculates and prints volume
    // of a box with length, width, and height
    public void printBoxVolume(double height) {
        double volume = length * width * height;
        System.out.println("The volume is: " + volume);
    }
}
