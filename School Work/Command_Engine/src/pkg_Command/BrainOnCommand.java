package pkg_Command;

public class BrainOnCommand implements Command {
	BrainDev brain;
	
	public BrainOnCommand(BrainDev brain){
		this.brain = brain;
	}
	public void execute() {
		brain.BrainOn();

	}

	@Override
	public void undo() {
		brain.BrainOff();
	}

}
