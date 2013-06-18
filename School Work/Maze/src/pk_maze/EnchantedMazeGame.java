package pk_maze;

public class EnchantedMazeGame extends MazeGame{

	MapSite createPart(String type) {
		if (type.equalsIgnoreCase("wall")){
			part = new Wall();

		}
		if (type.equalsIgnoreCase("room")){
			part = new Room();

		}
		if (type.equalsIgnoreCase("enchanted room") |  type.equalsIgnoreCase("enchantedroom") | type.equalsIgnoreCase("room enchanted") | type.equalsIgnoreCase("roomenchanted")){
			part = new EnchantedRoom();

		}
		if (type.equalsIgnoreCase("enchanted wall") |  type.equalsIgnoreCase("enchantedwall") | type.equalsIgnoreCase("wall enchanted") | type.equalsIgnoreCase("wallenchanted")){
			part = new EnchantedWall();

		}		
		return part;
	}
	

}

