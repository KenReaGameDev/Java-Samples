package SquareAdapt;

public class SquareAdapter implements Round{
	Square peg;

	public SquareAdapter (Square inPeg){
		this.peg = inPeg;
	}
	@Override
	public String GetType() {
		return this.peg.GetType();
	}

	@Override
	public void Fit(RoundHole hole) {
		hole.Accept(this);		
	}

}
