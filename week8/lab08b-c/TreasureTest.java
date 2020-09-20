public class TreasureTest {
	public static void main(String[] args) { 
	Treasure t1 = new Treasure("Key", "Golden Key", 1.5, 25);
	System.out.println("Name: " + t1.getName());
	System.out.println("Description: " + t1.getDescription());
	System.out.println("Weight: " + t1.getWeight());
	System.out.println("Value: " + t1.getValue());
	System.out.println();
	t1.setName("Ring");
	System.out.println("Name: " + t1.getName());
	t1.setDescription("Platinum ring");
	System.out.println("Description: " + t1.getDescription());
	t1.setWeight(2.5);
	System.out.println("Weight: " + t1.getWeight());
	t1.setValue(80);
	System.out.println("Value: " + t1.getValue());
	System.out.println();
	System.out.println(t1.toString());
	System.out.println("**************************************************************");
	}
}