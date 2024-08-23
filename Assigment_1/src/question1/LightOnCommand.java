package question1;

/**
 * 4.Similarly, use the Command interface and implement three concrete classes named LightOnCommand,
 * LightOffCommand,and LightDimCommand, overriding both execute() and undo()methods in each class.
 * The LightDimCommand should adjust the light's brightness to a specific level and be able to undo the action.
 **/
//LightOnCommand
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
