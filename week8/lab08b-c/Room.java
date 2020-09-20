public class Room { 
	private String name; 			// A short name describing the room
	private String description;		// A slightly longer desctiption of the room
	private Treasure tName;			// A handle to a treasure
	
	public Room(String _name, String _desc, Treasure _treasure) {
		name = _name;
		description = _desc;
		tName = _treasure;
	}
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String newDesc) {
		description = newDesc;
	}
	public Treasure getTreasure() {
		return tName;
	}
	public void setTreasure(Treasure newTreasure) {
		tName = newTreasure;
	}
	public String toString() {
		String output = "Room: " + name + "\nDescription: " + description
			+ "\nTreasure: " + tName;
			return output;
	}
}