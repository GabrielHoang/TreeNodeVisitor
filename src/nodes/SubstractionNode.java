package nodes;

public class SubstractionNode extends BinaryOperatorNode {

    public SubstractionNode(TreeNode left, TreeNode right) {
        super(left, right);
        this.label = MINUS;
    }

    @Override
    public int compute(int node1, int node2) {
        return 0;
    }
}
