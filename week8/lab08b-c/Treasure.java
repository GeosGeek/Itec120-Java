/*
*	@author Matt Crichton
*	@version 10/16/18
*/
public class Treasure {
	// Declaring instance variables that are encapsulated.
	private String name;
	private String description;
	private double weight;
	private int value;
	
	public Treasure(String _name, String _description, double _weight, int _value) {
		this.name = _name;
		this.description = _description;
		this.weight = _weight;
		this.value = _value;
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double newWeight) { 
		weight = newWeight;
	}
	public int getValue(){
		return value;
	}
	public void setValue(int newValue) {
		value = newValue;
	}
	public String toString() {
		String output = "Name: " + name + "\nDescription: " + description 
		+ "\nWeight: " + weight + "\nValue: " + value;
		return output;
	}
	public boolean equals(Treasure other) {
		boolean result = false;
		if ((this.name == other.getName()) &&
			(this.description == other.getDescription()) &&
			(this.weight == other.getWeight()) &&
			(this.value == other.getValue()))
				result = true;
		return result;
	}
	public int compareTo(Treasure other) {
		int result = 0; 
		if (this.value > other.value)
			result = 1;
		else if (this.value < other.value)
			result = -1;
		//System.out.println(this.value + " : " + other.value);
		return result;
	}
}