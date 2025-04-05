public abstract class Form3 {
    protected String color;
    private static int counter;

    public Form3() {
        this.color = "white";
        counter += 1;
    }

    public Form3(String color) {
        this.color = color;
        counter += 1;
    }

    public float getArea() {
        return 0;
    }

    public String toString() {
        return "This form has the color " + this.color;
    }

    public static int getCounter() {
        return counter;
    }

}