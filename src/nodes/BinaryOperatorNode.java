package nodes;

import visitors.Visitor;

public class BinaryOperatorNode implements TreeNode {

    public static final String PLUS = "+";
    public static final String MINUS = "-";
    public static final String DIV = "/";
    public static final String MULT = "*";
    public static final String MOD = "%";

    private TreeNode left;

    private TreeNode right;

    protected String label;

    public BinaryOperatorNode(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
    }

    public int compute(int node1, int node2) {
        return 0;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitorBinaryOperatorNode(this);
    }

    @Override
    public String getLabel() {
        return label;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
}
