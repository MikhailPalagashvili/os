package virtualization;

import hardware.InputOutputDevices;
import lombok.Data;

import java.util.List;
import java.util.Stack;

@Data
public class ProcessControlBlock {
    private ProcessIdentifier processIdentifier;
    private TextSection programCode;
    private Stack stack;
    private Heap heap;
    private ProcessState processState;
    private ProgramCounter programCounter;
    private List<Register> registers;
    private Process parent;
    private InputOutputDevices inputOutputDevices;
}
