public abstract class AbstractCalculator {
    protected Object state;

    public Object result() {

        return this.state;
    };

    public void clear() {
        this.state = 0;
    }



    public abstract AbstractCalculator init();
}
