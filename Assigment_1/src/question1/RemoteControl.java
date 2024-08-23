package question1;

import java.util.Stack;

/**
 * 5.
 * Create a RemoteControl class with methods to set
 * and execute commands for different slots, as well as undo the last executed command.
 **/

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> commandHistory;

    public RemoteControl(int i) {
        onCommands = new Command[7];
        offCommands = new Command[7];
        commandHistory = new Stack<>();

        Command noCommand = new Command() {
            @Override
            public void execute() { }
            @Override
            public void undo() { }
        };

    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        commandHistory.push(onCommands[slot]);
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        commandHistory.push(offCommands[slot]);
    }

    public void undoButtonWasPressed() {
        if (!commandHistory.isEmpty()) {
            commandHistory.pop().undo();
        } else {
            System.out.println("No commands to undo.");
        }
    }
}
