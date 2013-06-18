package pkg_Command;

public class MouseOnCommand implements Command {
	Mouse3D mouse;
	
	public MouseOnCommand(Mouse3D mouse){
		this.mouse = mouse;
	}
	public void execute() {
		mouse.MouseOn();

	}

	@Override
	public void undo() {
		mouse.MouseOff();
	}

}
