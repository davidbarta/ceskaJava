package compilator.statements;

import compilator.expressions.Expression;

public class ForStatement extends Statement{
    private ForHeader fh;
    private BlockStatement body;

    public ForStatement(ForHeader fh, BlockStatement bodyFor, int line) {
        super(StatementTypesEnum.FOR,line);
        this.body = bodyFor;
        this.fh=fh;
    }

    public BlockStatement getBody() {
        return body;
    }

    public ForHeader getForHeader() {
        return fh;
    }
}
