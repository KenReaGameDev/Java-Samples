package pk_maze;


public abstract class MazeGame {

	int previousRoom = 0;
	MapSite part;
	abstract MapSite createPart(String type);

	
}
