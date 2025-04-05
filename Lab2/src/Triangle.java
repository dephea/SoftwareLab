public class Triangle extends Form3 {
    private float height, base;

    public Triangle() {
        super();
    }

    public Triangle(float height, float base, String color){
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea() {
        return this.base * this.height * 0.5f;
    }

    @Override
    public String toString() {
        return "This triangle has the color " + super.color;
    }

    @Override
    public boolean equals(Object obj) {
        Triangle triangle = (Triangle) obj;

        return Float.compare(triangle.getArea(), this.getArea()) == 0;
    }
}
