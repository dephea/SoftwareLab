public class Circle extends Form3 {
    private float radius;

    public Circle() {
        super();
    }

    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return 3.1415f * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "This circle has the color " + super.color;
    }
}
