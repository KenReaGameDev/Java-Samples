package SquareAdapt;

public class RoundAdapter implements Square{
	Round peg;

	public RoundAdapter (Round inPeg){
		this.peg = inPeg;
	}
	@Override
	public String GetType() {
		return this.peg.GetType();
	}

	@Override
	public void Fit(SquareHole hole) {
		hole.Accept(this);		
	}

}
