class AreaCalculator {

    double calculateArea(double side) {
        return side * side;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

    
    double calculateArea(int radius) {
        return Math.PI * radius * radius;
    }
}

public class overloading {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Area of Square: " + calc.calculateArea(5.0));          
        System.out.println("Area of Rectangle: " + calc.calculateArea(4.0, 6.0)); 
        System.out.println("Area of Circle: " + calc.calculateArea(7));             
    }
}