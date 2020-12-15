package compilator.statements;

public class Statement {
    private StatementTypesEnum type;
    private int line;

    public Statement(StatementTypesEnum type, int line)
    {
        this.type = type;
        this.line = line;
    }

    public StatementTypesEnum getType() {
        return type;
    }

    public void setType(StatementTypesEnum type) {
        this.type = type;
    }

    public int getLine()
    {
        return line;
    }
}
