package xyz.nsgw.compiler.memory;

public class Variable extends RawVariable {

    private String value;

    private VariableType type;

    public Variable() {}

    public String getValue() {

        return value;

    }

    public void setValue(String value) {

        this.value = value;

    }

    public VariableType getType() {

        return type;

    }

    public void setType(VariableType type) {

        this.type = type;

    }
}
