// KAUSTUBH RAYKAR
// PRN - 21070126048
// AIML A3
class Circle extends Shape {
    double radius;

    // Constructor to set radius
    public Circle(double r) {
        radius = r;
    }

    // Method to calculate area of circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter of circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}