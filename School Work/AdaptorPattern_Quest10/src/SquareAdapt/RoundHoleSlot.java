package SquareAdapt;

public class RoundHoleSlot implements RoundHole {
	public String type = "Unknown Hole";
	
	public RoundHoleSlot(){
		this.type = "Round Hole";
	}

	public void Accept(Round peg) {
		if (peg.getClass() != RoundPeg.class){
			System.out.println("This " + peg.GetType() + " will fit in this " + this.GetType() + " with this Adapter!");
		}
		else {
			System.out.println("This " + peg.GetType() + " fits in this " + this.GetType());
		}

	}


	public String GetType() {

		return this.type;
	}



}
