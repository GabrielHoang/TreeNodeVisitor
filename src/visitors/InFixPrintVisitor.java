package visitors;

import nodes.BinaryOperatorNode;

public class InFixPrintVisitor extends Visitor {
    @Override
    public void visitorBinaryOperatorNode(BinaryOperatorNode node) {

        System.out.print(" ( ");
        node.getLeft().accept(this);

        printSign(node);

        node.getRight().accept(this);
        System.out.print(" ) ");
    }
}
