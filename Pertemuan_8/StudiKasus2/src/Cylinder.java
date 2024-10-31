

public class Cylinder extends Shape {
    private double radius,height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        SurfaceArea = Math.PI*(radius*radius)*height;
        return SurfaceArea;
    }

    public String toString() {
        return "Cylinder [radius=" + radius + ", height=" + height+"]";
    }

    
    
}