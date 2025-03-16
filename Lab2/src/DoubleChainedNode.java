public class DoubleChainedNode implements Node{
    private int value;
    private DoubleChainedNode nextNode, prevNode;

    public DoubleChainedNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DoubleChainedNode getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(DoubleChainedNode node) {
        this.nextNode = node;
    }

    public DoubleChainedNode getPrevNode() {
        return this.prevNode;
    }

    public void setPrevNode(DoubleChainedNode node) {
        this.prevNode = node;
    }
}
