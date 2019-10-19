package nodes;

public class AdditionNode extends BinaryOperatorNode {

    public AdditionNode(TreeNode left, TreeNode right) {
        super(left, right);
        this.label = PLUS;
    }

    @Override
    public int compute(int node1, int node2) {
        return node1 + node2;
    }

}
