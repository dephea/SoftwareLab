public class Square extends Form{
    private float side;

    public Square() {
        super();
    }

    public Square(float side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public float getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "This square has the color " + super.color;
    }
}