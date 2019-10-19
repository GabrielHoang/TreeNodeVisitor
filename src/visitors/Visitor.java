package visitors;

import nodes.BinaryOperatorNode;
import nodes.NumericNode;

import static nodes.BinaryOperatorNode.*;

public abstract class Visitor {
    public abstract void visitorBinaryOperatorNode(BinaryOperatorNode node);

    public void visitNumericNode(NumericNode node) {
        System.out.print(" " + node.getValue() + " ");
    }

    protected void getSign(BinaryOperatorNode node) {
        switch (node.getLabel()) {
            case PLUS:
                System.out.print(PLUS);
                break;
            case MINUS:
                System.out.print(MINUS);
                break;
            case DIV:
                System.out.print(DIV);
                break;
            case MULT:
                System.out.print(MULT);
                break;
            case MOD:
                System.out.print(MOD);
                break;
            case ROOT:
                break;
        }
    }
}
