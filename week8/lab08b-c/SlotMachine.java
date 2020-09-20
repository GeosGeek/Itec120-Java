import java.util.Random;
public class SlotMachine {
	private int slot1, slot2, slot3;
	public SlotMachine() {
		Random gen = new Random();
		this.slot1 = gen.nextInt(7);
		this.slot2 = gen.nextInt(7);
		this.slot3 = gen.nextInt(7);
	}
	public void spin() {
		slot1 = gen.nextInt(7);
		slot2 = gen.nextInt(7);
		slot3 = gen.nextInt(7);
	}
	public boolean isJackpot() {
		boolean jackpot = false;
		if (slot1 == slot2 && slot2 == slot3)
			jackpot = true;
		return jackpot;
	}
	public boolean isPair() {
		boolean pair = false;
		if (slot1 == slot2 || slot1 == slot3 || slot2 == slot3)
			pair = true;
		return pair;
	}
	public String toString() { 
		String output = "";
		output += slot1;
		output += slot2;
		output += slot3;
	}
}