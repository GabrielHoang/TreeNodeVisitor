package nodes;

public class DivisionNode extends BinaryOperatorNode {

    public DivisionNode(TreeNode left, TreeNode right) {
        super(left, right);
        this.label = DIV;
    }

    @Override
    public int compute(int node1, int node2) {
        return node1 - node2;
    }
}
