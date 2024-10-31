

public class Rectangle extends Shape {
    private Double Width,length;

    public Rectangle(Double Width, Double length) {
        super("Rectangle");
        this.Width = Width;
        this.length = length;
    }

    @Override
    public double area() {
        SurfaceArea = Width * length;
        return SurfaceArea;
    }
    
    
}