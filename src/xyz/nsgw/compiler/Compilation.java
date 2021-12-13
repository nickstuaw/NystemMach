package xyz.nsgw.compiler;

public class Compilation {

    public Compilation() {
    }

    public void read(final Instruction instruction) {
        if(instruction.getMeta().getType().equals(InstructionType.OUTPUT)) {
            System.out.println("");
        }
    }

}
