package compilator.statements;

import compilator.variable.Variable;

import java.util.ArrayList;
import java.util.List;

public class StatementData {
    private List<Statement> statements;


    private List<String> variableNames;

    private int forStatementCount = 0;

    public StatementData(List<Statement> statements)
    {
        this.statements = statements;
        this.variableNames = this.createVariableNamesList();
    }

    public int getVariableDeclarationCount()
    {
        return this.variableNames.size();
    }

    private List<String> createVariableNamesList()
    {
        List<String> list = new ArrayList<>();
        for (Statement statement: statements)
        {
            if (statement.getType() == StatementTypesEnum.DECLARATION)
            {
                StatementDeclare statementDeclaration = (StatementDeclare) statement;
                Variable variable = statementDeclaration.getVariable();

                list.add(variable.getName());

                if (variable.existsParallel())
                {
                    list.addAll(variable.getParallelArray());
                }
            }
            else if (statement.getType() == StatementTypesEnum.FOR)
            {
                this.forStatementCount++;
            }
        }

        return list;
    }

    public List<String> getVariableNames()
    {
        return variableNames;
    }

    public List<Statement> getStatements()
    {
        return this.statements;
    }

    public int getForStatementCount()
    {
        return forStatementCount;
    }
}
