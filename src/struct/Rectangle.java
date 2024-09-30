package struct;

class Rectangle {
    // Data members (similar to struct members)
    int length;
    int breadth;

    // Constructor to initialize values
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public int calculateArea() {
        return length * breadth;
    }
}
