public class Square {
    
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void computeArea() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }   
}
