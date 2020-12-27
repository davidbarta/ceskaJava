package compilator.statements;

public class SwitchBlockStatement extends Statement{
    private int identifier;
    private BlockStatement body;
    private boolean defaultBlock;

    public SwitchBlockStatement(BlockStatement block, int line,boolean defaultBlock){
        super(StatementTypesEnum.SWITCH_BLOCK,line);
        this.body = block;
        this.defaultBlock = defaultBlock;
    }
    public SwitchBlockStatement(BlockStatement block, int line,int identifier,boolean defaultBlock){
        super(StatementTypesEnum.SWITCH_BLOCK,line);
        this.body = block;
        this.defaultBlock = defaultBlock;
        this.identifier = identifier;
    }

    public BlockStatement getBody() {
        return body;
    }

    @Override
    public int getLine() {
        return super.getLine();
    }

    public int getIdentifier() {
        return identifier;
    }

    public boolean isDefaultBlock() {
        return defaultBlock;
    }
}
