package Java.Testes.LogicalExpressions.Class;

public class Expression {
    String[] propositions;
    String[] expression;
    String conclusion;

    public Expression(String[] propositions, String[] expression, String conclusion){
        this.propositions = propositions;
        this.expression = expression;
        this.conclusion = conclusion;
    }

    public String[] GetProposition(){
        return this.propositions;
    }

    public String GetConclusion(){
        return this.conclusion;
    }
}
