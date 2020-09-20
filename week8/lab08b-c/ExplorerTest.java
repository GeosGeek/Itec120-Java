public class ExplorerTest {
	public static void main(String[] args) {
		Treasure t1 = new Treasure("key", "a golden key", 1.5, 25);
		Room r1 = new Room("Start room", "a cold, dark, damp place", t1);
		Explorer e1 = new Explorer("Matt", r1, t1, t1);
		
		System.out.println(e1);
		System.out.println();
		System.out.println("The treasure in the room that the explorer is in : " 
							+ e1.getRoom().getTreasure().getName());
	}
}