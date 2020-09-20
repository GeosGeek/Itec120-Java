public class SlotMachineDrv {
	public static void main(String[] args) {
		int count = 0;
		SlotMachine machine1 = new SlotMachine();
		while (! machine1.isJackpot()) {
			machine1.spin();
			System.out.println(machine1);
			count++;
		}
	}
}