public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void computeArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
    
}
