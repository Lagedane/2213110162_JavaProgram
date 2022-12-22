
public class TestPiggyBank {
	public static void name() {
		PiggyBank pb = new PiggyBank();
		
		pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo(34);
		System.out.println("Add 2 Baht Money: " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen(13);
		System.out.println("Add 10 Baht Money: " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addFive(100);
	}
}
