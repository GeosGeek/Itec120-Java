public class RoomTest { 
	public static void main(String[] args) {
		Treasure lint = new Treasure("lint", "a piece of dust", 0, 0);
		Treasure key = new Treasure("key", "a golden key", 5, 25);
		Room startRoom = new Room("Start Room", "A cold, dark and damp place", key);
		Room davis = new Room("Davis 225", "a computer lab", lint);
		System.out.println();
		System.out.println(lint);
		System.out.println("==================================");
		System.out.println(key);
		System.out.println("==================================");
		System.out.println(startRoom);
		System.out.println("==================================");
		System.out.println(davis);
	}
}