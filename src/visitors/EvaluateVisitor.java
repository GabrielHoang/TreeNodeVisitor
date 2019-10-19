package visitors;

import nodes.BinaryOperatorNode;
import nodes.NumericNode;

import java.util.Stack;

public class EvaluateVisitor extends Visitor {

    private Stack<Integer> stack = new Stack<>();

    public int getValue() {
        return stack.pop();
    }

    @Override
    public void visitorBinaryOperatorNode(BinaryOperatorNode node) {
        int num1;
        int num2;

        node.getLeft().accept(this);
        node.getRight().accept(this);

        num2 = stack.pop();
        num1 = stack.pop();

        stack.push(performOperation(num1, num2, node));
    }

    @Override
    public void visitNumericNode(NumericNode node) {
        stack.push(node.getValue());
    }
}
