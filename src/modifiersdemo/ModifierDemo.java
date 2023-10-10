package modifiersdemo;

public class ModifierDemo {
	
	final static int id=10;
	final static String name="shivani";
    String address = null;
	
	public static void main(String[] args) {
		final ModifierDemo m1 = new ModifierDemo();
		m1.address = "swargate";
		System.out.println("address= " + m1.address);
		 
		 m1.address="goa";
		 System.out.println("address= " + m1.address);
		
	}

}
