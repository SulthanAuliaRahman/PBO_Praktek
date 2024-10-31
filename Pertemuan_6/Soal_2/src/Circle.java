
public class Circle extends Shape{ 
    // private instance variable, not accessible from outside this class
    protected double radius;

   /** Constructs a Circle instance with the given radius and default color */
    public Circle() { // 2nd constructor
      radius = 1.0;
   }
    
 
   public Circle(double radius) {
      this.radius = radius;
   }

   public Circle(String color, boolean filled, double radius) {
      super(color, filled);
      this.radius = radius;
   }


   public double getRadius() {
      return this.radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public double getArea() {
      return radius * radius * Math.PI;
   }

   public double getPerimeter(){
      return Math.PI*(2*radius);
   }

   @Override
   public String toString() {
      return "Circle [getColor()=" + getColor() + ", getRadius()=" + getRadius() + ", getFilled()=" + getFilled() + "]";
   }

 
 }
 