package SquareAdapt;

public class SquarePeg implements Square{
	public String type;
	
	public SquarePeg(){
		this.type = "Square Peg";
	}

	public void Fit(SquareHole hole) {
		hole.Accept(this);
	}


	public String GetType() {
		return this.type;		
	}

}
