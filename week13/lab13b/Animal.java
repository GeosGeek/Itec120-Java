public abstract class Animal {
	protected String name;
	protected String food;
	protected String sound;
	public Animal(String name, String food, String sound) {
		this.name = name;
		this.food = food;
		this.sound = sound;
	}
	public String speak() {
		return sound;
	}
	/*public String[][] eat(String[][] arr) {
		String[][] result = {["str1"], ["str2"]};
		return result;
	}*/
	public String toString() {
		String output = "";
		output += this.name + "\n" 
				+ "eats " + this.food + "\n" 
				+ "says " + this.sound;
		return output;
	}
}