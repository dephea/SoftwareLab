import java.util.ArrayList;

public class DoubleChainedList implements isSorted{
    private DoubleChainedNode head;

    public DoubleChainedList(int value) {
        this.head = new DoubleChainedNode(value);
    }

    public void addValue(int value) {
        if(this.head==null) {
            this.head = new DoubleChainedNode(value);
            return;
        }

        DoubleChainedNode current = head;
        while(current.getNextNode() != null) {
            current = current.getNextNode();
        }

        current.setNextNode(new DoubleChainedNode(value));
    }

    public DoubleChainedNode getNodeByValue(int value) {
        if (head == null) {
            return null;
        }

        if (head.getValue() == value) {
            return head;
        }

        DoubleChainedNode current = head;
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
            if (head.getNextNode() != null) {
                head.getNextNode().setPrevNode(null);
            }
            head = head.getNextNode();
            return true;
        }



        DoubleChainedNode current = head;
        while (current != null) {
            if (current.getValue() == value) {
                if (current.getPrevNode() != null) {
                    current.getPrevNode().setNextNode(current.getNextNode());
                }

                if (current.getNextNode() != null) {
                    current.getNextNode().setPrevNode(current.getPrevNode());
                }

                return true;
            }
            current = current.getNextNode();
        }

        return false;
    }

    public ArrayList<Integer> listNodes() {
        ArrayList<Integer> nodeList = new ArrayList<>();
        DoubleChainedNode current = head;

        while(current != null) {
            nodeList.add(current.getValue());
            current = current.getNextNode();
        }

        return nodeList;
    }

    @Override
    public boolean isSorted(boolean ascendingOrder) {
        DoubleChainedNode current = head;
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
