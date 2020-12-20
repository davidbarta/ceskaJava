package compilator.statements;

import compilator.expressions.Expression;

public class ForHeader {
    private String iden;
    private Expression from;
    private Expression to;

    public ForHeader(String iden, Expression from, Expression to){
        this.iden=iden;
        this.from = from;
        this.to = to;
    }

    public Expression getFrom() {
        return from;
    }

    public Expression getTo() {
        return to;
    }

    public String getIden() {
        return iden;
    }
}
