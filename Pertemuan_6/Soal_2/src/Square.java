

public class Square extends Rectangle {
    private double side;
    public Square() {
        this.side = 4
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled,double side) {
        this.side = side;
        super(color, filled, side,side);
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Shape [color=" + color + ", filled=" + filled + "]";
    }
}