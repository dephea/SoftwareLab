public class NewIntCalculator extends AbstractCalculator{
    private int state;


    @Override
    public NewIntCalculator init() {
        this.state = 0;
        return this;
    }

    @Override
    public Object result() {
        return (int)this.state;
    }

    public NewIntCalculator add(int value) {
        this.state += value;
        return this;
    }

    public NewIntCalculator substract(int value) {
        this.state -= value;
        return this;
    }

    public NewIntCalculator multiply(int value) {
        this.state *= value;
        return this;
    }
}
