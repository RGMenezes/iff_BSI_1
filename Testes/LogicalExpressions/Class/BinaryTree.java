package Java.Testes.LogicalExpressions.Class;

public class BinaryTree {
    String proposition;
    BinaryTree leftSide;
    BinaryTree rightSide;
    String[] truths;

    public BinaryTree(String proposition, String[] truths){
        this.proposition = proposition;
        this.truths = truths;
        leftSide = rightSide = null;
    }

    public String GetProposition(){
        return this.proposition;
    }

    public void SetProposition(String newProposition) {
        this.proposition = newProposition;
    }

    public void addLeftSide(BinaryTree propositionValue){
        this.leftSide = propositionValue;
    }

    public void addRightSide(BinaryTree propositionValue){
        this.rightSide = propositionValue;
    }

    public void attTruths(String[] newTruths){
        String[] newArrayTruths = new String[this.truths.length + newTruths.length];

        for (int i = 0; i < this.truths.length; i++)
            newArrayTruths[i] = this.truths[i];

        for (int i = 0; i < newTruths.length; i++) {
            newArrayTruths[this.truths.length + i] = newTruths[i];
        }

        this.truths = newArrayTruths;
    }
}
