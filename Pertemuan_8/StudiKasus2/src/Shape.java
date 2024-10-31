

public abstract class Shape {
    String ShapeName;
    Double SurfaceArea;
    public abstract double area();

    public String toString() {
        return "Shape [name=" + ShapeName + "]";
    }

    public Shape(String shapeName) {
        ShapeName = shapeName;
    }
    
}