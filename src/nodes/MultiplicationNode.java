package nodes;

public class MultiplicationNode extends BinaryOperatorNode {

    public MultiplicationNode(TreeNode left, TreeNode right) {
        super(left, right);
        this.label = MULT;
    }

    @Override
    public int compute(int node1, int node2) {
        return 0;
    }
}
