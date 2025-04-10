public class DoubleCalculator extends AbstractCalculator{
    protected double state;


    @Override
    public DoubleCalculator init() {
        this.state = 0;
        return this;
    }

    @Override
    public Object result() {
        return (double)this.state;
    }

    public DoubleCalculator add(double value) {
        this.state += value;
        return this;
    }

    public DoubleCalculator substract(double value) {
        this.state -= value;
        return this;
    }

    public DoubleCalculator multiply(double value) {
        this.state *= value;
        return this;
    }

    public DoubleCalculator divide(int value) throws ArithmeticException{

        if (value == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        this.state /= value;
        return this;
    }
}
