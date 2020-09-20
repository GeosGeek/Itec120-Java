/*
*	@author Matt Crichton
*	@version 10/31
*/
public class TreasureArrayDrv {
	public static void main(String[] args) {
		TreasureArraySrv srv = new TreasureArraySrv();
		Treasure t1 = new Treasure("rtx 2080", "the best GPU", 5, 1000);
		Treasure t2 = new Treasure("gtx 1080", "a really good GPU", 5, 700);
		Treasure t3 = new Treasure("rx 580", "a budget GPU", 5, 350);
		Treasure t4 = new Treasure("Titan X", "processing GPU", 5, 1200);
		
		Treasure[] arr1 = {t1, t2, t3};
		System.out.println("===== MAX ========");
		System.out.println(srv.max(arr1));
		System.out.println("===== MIN ========");
		System.out.println(srv.min(arr1));
		
	}
}