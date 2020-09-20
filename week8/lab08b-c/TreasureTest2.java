public class TreasureTest2 {
	public static void main(String[] args) {
		Treasure t1 = new Treasure("rtx 2080ti", "Nvidias newest GPU", 5, 1200);
		Treasure t10 = new Treasure("rtx 2080ti", "Nvidias newest GPU", 5, 1200);
		Treasure t11 = new Treasure("rtx 2080ti", "Nvidias newest GPU", 5, 10000);
		Treasure t12 = new Treasure("rtx 2080ti", "Nvidias newest GPU", 1, 1200);
		Treasure t13 = new Treasure("rtx 2080ti", "AMDs newest GPU", 5, 1200);
		Treasure t14 = new Treasure("rx Vega 56", "Nvidias newest GPU", 5, 1200);
		Treasure t15 = new Treasure("rx 580", "AMDs budget GPU", 5, 400);
		
		System.out.println("1: " + (t1 == t1));
		System.out.println("2: " + (t1 == t10));
		System.out.println("3: " + (t1 == t11));
		System.out.println("3: " + t1.equals(t1));
		System.out.println("4: " + t1.equals(t11));
		System.out.println("5: " + t1.equals(t12));
		System.out.println("6: " + t1.equals(t13));
		System.out.println("7: " + t1.equals(t14));
		System.out.println("8: " + t1.equals(t10));
		System.out.println("9: " + t1.compareTo(t1));
		System.out.println("10: " + t1.compareTo(t10));
		System.out.println("11: " + t1.compareTo(t11));
		System.out.println("12: " + t1.compareTo(t14));
		System.out.println("*************************");
		Room davis = new Room("Davis", "pc lab", t1);
		Explorer e1 = new Explorer("Matt", davis, t11, t11);
		System.out.println("1: " + (e1.getLeftPocket() == e1.getRightPocket()));
		e1.setLeftPocket(t14);
		System.out.println("2: " + (e1.getLeftPocket() == e1.getRightPocket()));
		e1.setLeftPocket(t11);
		System.out.println("3: " + e1.getLeftPocket().equals(e1.getRightPocket()));
		e1.setLeftPocket(t14);
		System.out.println("4: " + e1.getLeftPocket().equals(e1.getRightPocket()));
		e1.setRightPocket(t12);
		System.out.println("5: " + e1.getLeftPocket().compareTo(e1.getRightPocket()));
		e1.setRightPocket(t15);
		System.out.println("6: " + e1.getLeftPocket().compareTo(e1.getRightPocket()));
		e1.setLeftPocket(t15);
		e1.setRightPocket(t12);
		System.out.println("7: " + e1.getLeftPocket().compareTo(e1.getRightPocket()));
	}
}