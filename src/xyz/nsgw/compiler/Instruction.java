package xyz.nsgw.compiler;

public class Instruction {

    private final InstructionType type;

    private InstructionMeta meta;

    public Instruction(final InstructionType whichType, final String raw) {

        this.type = whichType;

        this.meta = new InstructionMeta(whichType, raw);

    }

    public InstructionMeta getMeta() {

        return meta;

    }

    public void setMeta(InstructionMeta meta) {

        this.meta = meta;

    }

    @Override
    public String toString() {
        return "Instruction{" +
                "type=" + type +
                ", meta=" + meta +
                '}';
    }

    public InstructionType getType() {

        return this.type;

    }

}
