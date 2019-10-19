package visitors;

import nodes.BinaryOperatorNode;
import nodes.NumericNode;
import nodes.TreeNode;

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
        }
    }

    protected int performOperation(int num1, int num2, TreeNode node) {
        int result = 0;
        switch (node.getLabel()) {
            case PLUS:
                result = num1 + num2;
                break;
            case MINUS:
                result = num1 - num2;
                break;
            case DIV:
                result = num1 / num2;
                break;
            case MULT:
                result = num1 * num2;
                break;
            case MOD:
                result = num1 % num2;
                break;
        }
        return result;
    }
}
