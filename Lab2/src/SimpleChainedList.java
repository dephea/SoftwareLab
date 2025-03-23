import java.util.ArrayList;

public class SimpleChainedList implements isSorted{

    private SimpleChainedNode head;

    public SimpleChainedList(int value) {
        this.head = new SimpleChainedNode(value);
    }

    public void addValue(int value) {
        if(this.head==null) {
            this.head = new SimpleChainedNode(value);
            return;
        }

        SimpleChainedNode current = head;
        while(current.getNextNode() != null) {
            current = current.getNextNode();
        }

        current.setNextNode(new SimpleChainedNode(value));
    }

    public SimpleChainedNode getNodeByValue(int value) {
        if (head == null) {
            return null;
        }

        if (head.getValue() == value) {
            return head;
        }

        SimpleChainedNode current = head;
        while(current.getNextNode() != null && current.getNextNode().getValue() != value) {
            current = current.getNextNode();
        }

        if (current.getValue() == value) {
            return current;
        }

        return null;
    }

    public boolean removeNodeByValue(int value) {
        if (head == null) {
            return false;
        }

        if (head.getValue() == value) {
            head = head.getNextNode();
            return true;
        }

        SimpleChainedNode current = head;
        while (current.getNextNode() != null) {
            if (current.getNextNode().getValue() == value) {
                current.setNextNode(current.getNextNode().getNextNode());
                return true;
            }
            current = current.getNextNode();
        }

        return false;
    }


    public ArrayList<Integer> listNodes() {
        ArrayList<Integer> nodeList = new ArrayList<>();
        SimpleChainedNode current = head;

        while(current != null) {
            nodeList.add(current.getValue());
            current = current.getNextNode();
        }

        return nodeList;
    }

    @Override
    public boolean isSorted(boolean ascendingOrder) {
        SimpleChainedNode current = head;
        while (current.getNextNode() != null) {
            if (ascendingOrder) {
                if (current.getValue() > current.getNextNode().getValue()) {
                    return false;
                }
            } else {
                if (current.getValue() < current.getNextNode().getValue()) {
                    return false;
                }
            }
            current = current.getNextNode();
        }
        return true;
    }
}
