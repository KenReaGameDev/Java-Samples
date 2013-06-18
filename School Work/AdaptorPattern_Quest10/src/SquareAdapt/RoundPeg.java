package SquareAdapt;

public class RoundPeg implements Round{
	public String type;
	
	public RoundPeg(){
		this.type = "Round Peg";
	}

	public String GetType() {
		return this.type;		
	}

	@Override
	public void Fit(RoundHole hole) {
		hole.Accept(this);		
	}

}
