package Java.Testes.LogicalExpressions.Solver;

import Java.Testes.LogicalExpressions.Class.BinaryTree;
import Java.Testes.LogicalExpressions.Class.Expression;

public class Solver {
    public static void main(String[] args) {
        String[] propositions = {"test p0", "test p1", "test p2"};
        String[] expression = {"p0 ; p2", "p2 v p1", "~p2"};
        Expression test1 = new Expression(propositions, expression, "p0 ; p1");

        // negação = ~
        // e = ^
        // ou = v
        // ou Exclusivo  = |
        // condicional  = ;
        // bicondicional = :

        //Estruturação da proposição
        String propositionComplete = "(";
        for (int i = 0; i < test1.GetProposition().length; i++) {
            propositionComplete += (i == 1 ? "" : " ^ ") + "(" + test1.GetProposition()[i] + ")";
        }
        propositionComplete += ") ; ~(" + test1.GetConclusion() + ")";

        //Remover espaços em branco
        propositionComplete = propositionComplete.replace(" ", "");

        //Conferindo se os parenteses estão corretos
        char[] charProposition = propositionComplete.toCharArray();
        
        int index1C = -1, index2C = -1, cont1C = 0, cont2C = 0;
        for (int i = 0; i < charProposition.length; i++) {
            if(charProposition[i] == '('){
                if(index1C == -1)
                    index1C = i;
                cont1C += 1;

            }else if(charProposition[i] == ')'){
                cont2C += 1;
                if(cont1C == cont2C && index2C == -1)
                    index2C = i;
            }

            if(cont2C > cont1C) 
                throw new IllegalArgumentException("Wrongly defined priority structures (square brackets )( )");
        }
        if(cont1C != cont2C)
            throw new IllegalArgumentException("Wrongly defined priority structures (brackets (() )");

        //Iniciando arvore
        //BinaryTree BinaryTree1 = new BinaryTree(propositionComplete, new String[0]);
    }

    public String TreeBuilder(BinaryTree tree){
        String proposition = tree.GetProposition();
        while (proposition.contains("~~")) {
            proposition = proposition.replace("~~", "");
        }

        //boolean isNegated = proposition.trim().startsWith("~");

        while (true) {
            boolean isInverted = false;

            if( (proposition.startsWith("((") || proposition.startsWith("~(~(")) && proposition.endsWith("))") ){
                int cont1C = 0, cont2C = 0;

                String copyProposition;
                if(proposition.startsWith("("))
                    copyProposition = proposition.substring(1, proposition.length() - 2);
                else
                    copyProposition = proposition.substring(2, proposition.length() - 2);

                char[] copyPropositionArray = copyProposition.toCharArray();
                for (int i = 0; i < copyPropositionArray.length; i++) {
                    if(copyPropositionArray[i] == '('){
                        cont1C += 1;
                    }else if(copyPropositionArray[i] == ')'){
                        cont2C += 1;
                    }
    
                    if(cont2C > cont1C) 
                        isInverted = true;
                }

                if(isInverted || cont1C == 1)
                    break;
                else 
                    proposition = copyProposition;
            }else{
                break;
            }

        }

        if(tree.GetProposition().length() < 3){
            //proposição unica (talvez negada)
        }
        return "";
    }
}