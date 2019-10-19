package visitors;

import java.util.Stack;

public class EvaluateVisitor {

    private Stack<Integer> stack = new Stack<>();

    public int getValue() {
        return stack.pop();
    }
}
