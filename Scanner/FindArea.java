package Scanner;

class FindArea {
    
    public double area(double radius) {
        return Math.PI * radius * radius;
    }


    public double area(int side) {
        return side * side;
    }

    
    public double area(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        FindArea obj = new FindArea();
        
        System.out.println("Area of Circle: " + obj.area(5.0));
        System.out.println("Area of Square: " + obj.area(4));
        System.out.println("Area of Rectangle: " + obj.area(4, 6));
    }
}
