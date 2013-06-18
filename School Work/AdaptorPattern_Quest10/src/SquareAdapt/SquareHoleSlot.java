package SquareAdapt;

public class SquareHoleSlot  implements SquareHole{
	public String type = "Unknown Hole";
	
	public SquareHoleSlot(){
		this.type = "Square Hole";
	}
	
	public String GetType() {
		return this.type;
	}

	public void Accept(Square peg) {
		if (peg.getClass() != SquarePeg.class){
			System.out.println("This " + peg.GetType() + " will fit in this " + this.GetType() + " with this Adapter!");
		}
		else {
			System.out.println("This " + peg.GetType() + " fits in this " + this.GetType());
		}

	}


}
