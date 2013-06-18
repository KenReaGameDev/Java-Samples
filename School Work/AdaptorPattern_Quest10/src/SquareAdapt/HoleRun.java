package SquareAdapt;

public class HoleRun {


	public static void main(String[] args) {
		Round Peg_Round = new RoundPeg();
		RoundHole Hole_Round = new RoundHoleSlot();
		Square Peg_Square = new SquarePeg();
		SquareHole Hole_Square = new SquareHoleSlot();
		
		//Peg_Round.Fit(Hole_Square);
		//Peg_Square.Fit(Hole_Round);
		
		Peg_Round.Fit(Hole_Round);
		Peg_Square.Fit(Hole_Square);
		
		RoundAdapter Adapter_Round = new RoundAdapter(Peg_Round);
		Adapter_Round.Fit(Hole_Square);
		
		SquareAdapter Adapter_Square = new SquareAdapter(Peg_Square);
		Adapter_Square.Fit(Hole_Round);
		//Peg_Square.Fit(Hole_Square);
		

	}

}
