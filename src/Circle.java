public class Circle {
    private double radius;

    public Circle(double circleRadius) {
        radius = circleRadius;
    }

    public void getArea() {
        System.out.println("A circle with radius " + radius + " has an area of " + (radius * radius * Math.PI));
    }
}
