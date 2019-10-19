package visitors;

import nodes.BinaryOperatorNode;
import nodes.NumericNode;

public abstract class Visitor {
    public abstract void visitrBinaryOperatorNode(BinaryOperatorNode node);
    public abstract void visitNumericNode(NumericNode node);
}
