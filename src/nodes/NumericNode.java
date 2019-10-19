package nodes;

import visitors.Visitor;

public class NumericNode implements TreeNode{

    private int value;

    public NumericNode(int value) {
        this.value = value;
    }

    @Override
    public void accept(Visitor visitor) {

    }

    @Override
    public String getLabel() {
        return null;
    }

    public int getValue() {
        return value;
    }


}
