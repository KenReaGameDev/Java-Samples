package pkg_Command;

public class ConsoleTest {

	public static void main(String[] args) {
		Console console = new Console();
		
		BrainDev brain = new BrainDev();
		Mouse3D mouse = new Mouse3D();
		FitnessDev fitness = new FitnessDev();
		
		MouseOnCommand mouseOn = new MouseOnCommand(mouse);
		MouseOffCommand mouseOff = new MouseOffCommand(mouse);
		
		FitnessOnCommand fitnessOn = new FitnessOnCommand(fitness);
		FitnessOffCommand fitnessOff = new FitnessOffCommand(fitness);
		
		BrainOnCommand brainOn = new BrainOnCommand(brain);
		BrainOffCommand brainOff = new BrainOffCommand(brain);
		
		console.setCommand(0, mouseOn, mouseOff);
		console.setCommand(1, fitnessOn, fitnessOff);
		console.setCommand(2, brainOn, brainOff);
		
		System.out.println(console);
		
		console.onButtonWasPushed(0);
		console.offButtonWasPushed(0);
		console.onButtonWasPushed(1);
		console.offButtonWasPushed(1);
		console.onButtonWasPushed(2);
		console.offButtonWasPushed(2);
	}

}
