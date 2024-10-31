

public class Sphere extends Shape{
    private double radius;

    public Sphere(double r) {
        super("Sphere");    
        this.radius = r;
    }
    
    public double area() {
        SurfaceArea = 4*Math.PI*(radius*radius);
        return SurfaceArea;
    }

    @Override
    public String toString() {
        return "Sphere [ShapeName=" + ShapeName + ", radius=" + radius+"]";
    }

    
}