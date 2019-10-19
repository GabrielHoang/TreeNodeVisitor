package nodes;

public class ModuloNode extends BinaryOperatorNode {

    public ModuloNode(TreeNode left, TreeNode right) {
        super(left, right);
    }

    @Override
    public int compute(int node1, int node2) {
        return 0;
    }

    @Override
    public String getLabel() {
        return null;
    }
}
