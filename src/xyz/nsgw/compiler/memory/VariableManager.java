package xyz.nsgw.compiler.memory;

import java.util.List;

public class VariableManager {

    private List<RawVariable> variables;

     public VariableManager() {}

    public List<RawVariable> getVariables() {

        return variables;

    }

    public void setVariables(List<RawVariable> variables) {

        this.variables = variables;

    }

    public void setVariable(final int index, final RawVariable variable) {

         this.variables.set(index, variable);

    }

}
