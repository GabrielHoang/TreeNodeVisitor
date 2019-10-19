import nodes.*;
import visitors.InFixPrintVisitor;
import visitors.PostFixPrintVisitor;
import visitors.PreFixPrintVisitor;

public class Main {
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

        InFixPrintVisitor inFixVisitor = new InFixPrintVisitor();
        PostFixPrintVisitor postFixVisitor = new PostFixPrintVisitor();
        PreFixPrintVisitor preFixVisitor = new PreFixPrintVisitor();

        root.accept(preFixVisitor);
        System.out.println();

        root.accept(inFixVisitor);
        System.out.println();

        root.accept(postFixVisitor);
        System.out.println();
    }
}
