package nodes;

import visitors.Visitor;

public abstract class BinaryOperatorNode implements TreeNode{

    private TreeNode left;

    private TreeNode right;

    public abstract int compute(int node1, int node2);

    public BinaryOperatorNode(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitrBinaryOperatorNode(this);
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
}
