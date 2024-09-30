package struct;

public class Main {
    public static void main(String[] args) {
    	
        // Declaration and Initialization
        Rectangle r = new Rectangle(10, 5);

        // Accessing members using . (dot) operator
        // overriding the value of the initial declared
        r.length = 15;
        r.breadth = 10;

        // Calculating area
        System.out.println("Area of rectangle is: " + r.calculateArea());
    }
}
