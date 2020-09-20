
/***********************
 *
 *   Treasure
 *
 *   Author:   Shawn Brenneman
 *   Date:     2016-Oct
 *
 ***********************/
import java.util.*;

public class Treasure {

	private String name;
	private String description;
	private double weight;
	private int value;

	/**
	 * Constructor for objects of class Treasure.
	 */
	public Treasure(String name, String description, double weight, int value) throws InvalidTreasureException {
		this(name + "," + description + "," + weight + "," + value);
	}

	/**
	 * treasureData contains the following fields, separated by commas: - the
	 * name of the treasure (must be two or more characters) - a description of
	 * the treasure - a double representing the weight of the treasure (must be
	 * positive) - an integer representing the value of the treasure (cannot be
	 * negative)
	 */
	public Treasure(String treasureData) throws InvalidTreasureException {
		Scanner treasureScan = new Scanner(treasureData);
		treasureScan.useDelimiter(",");
		String name = "";
		String descrip = "";
		double weight = 0;
		int value = 0;
		
		
		try {
			name = treasureScan.next();
			descrip = treasureScan.next();
			weight = treasureScan.nextDouble();
			value = treasureScan.nextInt();
		} catch(NoSuchElementException e) {
			throw new InvalidTreasureException("A valid treasure must have: name, description, weight, and value");
		}

		if (name.length() <= 1) {
			throw new InvalidTreasureException("Treasure name must be two or more characters.");
		}
		if (this.getWeight() < 0) {
			throw new InvalidTreasureException("Weight must be positive");
		}
		if (this.getValue() < 0) {
			throw new InvalidTreasureException("Value must be positive");
		}

		this.name = name;
		this.description = descrip;
		this.weight = weight;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getWeight() {
		return weight;
	}

	public int getValue() {
		return value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String toString() {
		return "Treasure: Name: " + name + "\n    Description: " + description + "\n    Weight: " + weight + "  Value: "
				+ value;
	}

	public boolean equals(Treasure otherTreasure) {
		if (this.name.equals(otherTreasure.name) && this.description.equals(otherTreasure.description)
				&& this.weight == otherTreasure.weight && this.value == otherTreasure.value) {
			return true;
		} else {
			return false;
		}
	}

	public int compareTo(Treasure otherTreasure) {
		return this.value - otherTreasure.value;
	}

}
