public class SimpleChainedNode implements Node{

    private int value;
    private SimpleChainedNode nextNode;

    public SimpleChainedNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SimpleChainedNode getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(SimpleChainedNode node) {
        this.nextNode = node;
    }
}
