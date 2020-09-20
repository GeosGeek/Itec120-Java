public abstract class Producer extends Animal {
	protected String gives;
	public Producer(String name, String eats, String sound, String gives) {
		super(name, eats, sound);
		this.gives = gives;
	}
	public String toString() {
		return (Animal.toString() + " " + gives);
	}
}