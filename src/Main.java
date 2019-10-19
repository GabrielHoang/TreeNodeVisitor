import nodes.*;
import visitors.EvaluateVisitor;
import visitors.InFixPrintVisitor;
import visitors.PostFixPrintVisitor;
import visitors.PreFixPrintVisitor;

public class Main {

    static InFixPrintVisitor inFixVisitor = new InFixPrintVisitor();
    static PostFixPrintVisitor postFixVisitor = new PostFixPrintVisitor();
    static PreFixPrintVisitor preFixVisitor = new PreFixPrintVisitor();
    static EvaluateVisitor evaluateVisitor = new EvaluateVisitor();
    
    public static void main(String[] args) {

        NumericNode one = new NumericNode(1);
        NumericNode two = new NumericNode(2);
        NumericNode three = new NumericNode(3);
        NumericNode four = new NumericNode(4);
        NumericNode five = new NumericNode(5);
        NumericNode six = new NumericNode(6);


        BinaryOperatorNode min1 = new SubstractionNode(two, one);
        BinaryOperatorNode add2 = new AdditionNode(min1, five);
        BinaryOperatorNode mult1 = new MultiplicationNode(three, four);
        BinaryOperatorNode div1 = new DivisionNode(mult1, six);
        BinaryOperatorNode root = new ModuloNode(add2, div1);

        testVisitors(root);

        Parser parser = new Parser();
        TreeNode rootNodeParsed = parser.parse("(  (  (  7 % 4  ) - 1  ) * (  (  10 / 2  ) + 13  )  )");

        testVisitors(rootNodeParsed);
    }

    private static void testVisitors(TreeNode rootNode) {

        rootNode.accept(preFixVisitor);
        System.out.println();

        rootNode.accept(inFixVisitor);
        System.out.println();

        rootNode.accept(postFixVisitor);
        System.out.println();

        rootNode.accept(evaluateVisitor);
        System.out.println("Expression value: " + evaluateVisitor.getValue() + "\n");
    }
}
