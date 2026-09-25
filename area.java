import java.util.Scanner;

class AreaPerimeter {

    static void square(double side) {
        System.out.println("Square Area = " + (side * side));
        System.out.println("Square Perimeter = " + (4 * side));
    }

    static void rectangle(double length, double width) {
        System.out.println("Rectangle Area = " + (length * width));
        System.out.println("Rectangle Perimeter = " + (2 * (length + width)));
    }

    static void triangle(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Triangle Area = " + area);
        System.out.println("Triangle Perimeter = " + (a + b + c));
    }

    static void circle(double radius) {
        System.out.println("Circle Area = " + (Math.PI * radius * radius));
        System.out.println("Circle Perimeter = " + (2 * Math.PI * radius));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        square(side);

        System.out.print("Enter length and width of rectangle: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        rectangle(length, width);

        System.out.print("Enter three sides of triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        triangle(a, b, c);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        circle(radius);

        sc.close();
    }
}