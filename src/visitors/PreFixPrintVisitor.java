package visitors;

import nodes.BinaryOperatorNode;

public class PreFixPrintVisitor extends Visitor {
    @Override
    public void visitorBinaryOperatorNode(BinaryOperatorNode node) {

        System.out.print(" ( ");
        printSign(node);
        node.getLeft().accept(this);

        node.getRight().accept(this);
        System.out.print(" ) ");
    }
}
