package pk_maze;

public class MazeRun {
	
	public static void main(String[] args) {
		MazeGame maze1 = new EnchantedMazeGame();
		MapSite site = maze1.createPart("wall");
		System.out.println("Exits: " + site.exits 
				+ " Walls: " + site.walls
				+ " Secret Exits: " + site.secretExits);
		site = maze1.createPart("enchanted room");
		System.out.println("Exits: " + site.exits 
				+ " Walls: " + site.walls
				+ " Secret Exits: " + site.secretExits);
	}
}
