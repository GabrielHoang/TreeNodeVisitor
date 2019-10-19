package visitors;

import nodes.BinaryOperatorNode;

public class PostFixPrintVisitor extends Visitor {
    @Override
    public void visitorBinaryOperatorNode(BinaryOperatorNode node) {

        System.out.print(" ( ");
        node.getLeft().accept(this);

        node.getRight().accept(this);
        printSign(node);
        System.out.print(" ) ");
    }
}
