package xyz.nsgw.compiler;

public class InstructionMeta {

    private InstructionType type;

    private String raw;

    private String[] arguments;

    public InstructionMeta(final InstructionType whichType, final String whichRaw) {

        this.type = whichType;

        this.raw = whichRaw;

    }

    public InstructionType getType() {

        return type;

    }

    public void setType(InstructionType type) {

        this.type = type;

    }

    public String getRaw() {

        return raw;

    }

    public void setRaw(String raw) {

        this.raw = raw;

    }

    public String[] getArguments() {

        return arguments;

    }

    public void setArguments(String[] arguments) {

        this.arguments = arguments;

    }
}
