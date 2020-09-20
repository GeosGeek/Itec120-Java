public class Horse extends Animal { 
	protected String type;
	public Horse(String name, String type) {
		super(name, "hay", "nay");
		this.type = type;
	}
}