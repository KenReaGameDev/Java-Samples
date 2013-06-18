package pkg_Command;

public class MouseOffCommand implements Command {
	Mouse3D mouse;
	
	public MouseOffCommand(Mouse3D mouse){
		this.mouse = mouse;
	}
	public void execute() {
		mouse.MouseOff();

	}

	@Override
	public void undo() {
		mouse.MouseOn();
	}

}
