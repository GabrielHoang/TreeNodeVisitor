import nodes.*;

import java.util.Stack;
import java.util.StringTokenizer;

import static nodes.BinaryOperatorNode.*;

public class Parser {

    private Stack<TreeNode> treeStack = new Stack<>();
    private Stack<String> opStack = new Stack<>();
    private StringTokenizer tokenizer;
    private String[] operators = new String[]{"+", "-", "*", "/", "%"};

    public TreeNode parse(String inFixExpression) {
        tokenizer = new StringTokenizer(inFixExpression);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();

            if (token.equals("(")) {
                opStack.push(token);
            }

            if (isInteger(token)) {
                NumericNode numericNode = new NumericNode(Integer.valueOf(token));
                treeStack.push(numericNode);
            }

            if (isOperator(token)) {
                if (opStack.empty() || opStack.peek().equals("(") || priority(opStack.peek()) < priority(token)) {
                    opStack.push(token);
                } else {
                    do {
                        PopConnectPush();
                    } while (!opStack.empty() && !opStack.peek().equals("(") && priority(token) < priority(opStack.peek()));
                    opStack.push(token);
                }
            }

            if (token.equals(")")) {
                while (!opStack.peek().equals("(")) PopConnectPush();
                opStack.pop();
            }
        }

        while (!opStack.empty()) {
            PopConnectPush();
        }

        return treeStack.pop();
    }

    private void PopConnectPush() {
        TreeNode right = treeStack.pop();
        TreeNode left = treeStack.pop();
        treeStack.push(getOperatorNode(opStack.pop(), left, right));
    }

    private boolean isInteger(String integer) {
        try {
            Integer.parseInt(integer);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean isOperator(String op) {
        boolean isOp = false;
        for (int i = 0; i < operators.length; i++)
            if (operators[i].equals(op)) isOp = true;
        return isOp;
    }

    private int priority(String op) {
        if (op.equals("*"))
            return 2;
        else if (op.equals("/"))
            return 2;
        else if (op.equals("%"))
            return 2;
        else if (op.equals("+"))
            return 1;
        else if (op.equals("-"))
            return 1;
        else
            return -1;
    }

    private TreeNode getOperatorNode(String sign, TreeNode left, TreeNode right) {
        TreeNode returnNode = null;

        switch (sign) {
            case PLUS:
                returnNode = new AdditionNode(left, right);
                break;
            case MINUS:
                returnNode = new SubstractionNode(left, right);
                break;
            case DIV:
                returnNode = new DivisionNode(left, right);
                break;
            case MULT:
                returnNode = new MultiplicationNode(left, right);
                break;
            case MOD:
                returnNode = new ModuloNode(left, right);
                break;
        }
        return returnNode;
    }
}
