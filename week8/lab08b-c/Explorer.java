/*
*	@author Matt Crichton
*	@version 10/22/18
*/
public class Explorer {
	private String name;
	private Room room;
	private Treasure leftPocket;
	private Treasure rightPocket;

	public Explorer(String _name, Room _room, Treasure _leftPocket, Treasure _rightPocket) {
		this.name = _name;
		this.room = _room;
		this.leftPocket = _leftPocket;
		this.rightPocket = _rightPocket;
	}
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room newRoom) {
		room = newRoom;
	}
	public Treasure getLeftPocket() {
		return leftPocket;
	}
	public void setLeftPocket(Treasure newLeftPocket) {
		leftPocket = newLeftPocket;
	}
	public Treasure getRightPocket() {
		return rightPocket;
	}
	public void setRightPocket(Treasure newRightPocket) {
		rightPocket = newRightPocket;
	}
	public String toString() {
		String output = "Explorer: " + name + "\nLeft Pocket: " + leftPocket
			+ "\nRight Pocket: " + rightPocket + "\nRoom: " + room;
			return output;
	}
}