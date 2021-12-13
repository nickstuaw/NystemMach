package xyz.nsgw.compiler.memory;

public class ConstantVariable extends RawVariable {

    private final String value;

    private VariableType type;

    public ConstantVariable(final String value) {

        this.value = value;

    }

    public String getValue() {

        return value;

    }

    public VariableType getType() {

        return type;

    }

    public void setType(VariableType type) {

        this.type = type;
        
    }

}
