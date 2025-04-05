public class IntCalculator {
    private int state;

    public IntCalculator(int value) {
        this.state = value;
    }

    public IntCalculator add(int number) {
        this.state += number;
        return this;
    }

    public IntCalculator substract(int number){
        this.state -= number;
        return this;
    }

    public IntCalculator multiply(int number) {
        this.state *= number;
        return this;
    }

    public int result() {
        return state;
    }

    public void clear() {
        this.state = 0;
    }
}
