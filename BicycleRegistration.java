public class BicycleRegistration
{

	public static void main(String [] args) {
		Bicycle bike1, bike2, bike3,moy;
		String owner1,owner2,tagNo,owner;
		
		bike1= new Bicycle ();
		bike1.setOwnerName("Adams Smith");

		bike2= new Bicycle ();
		bike2.setOwnerName("Ben Jones");
		
		bike3= new Bicycle ();
		bike3.setTagNo("2004-134R");
		
		moy= new Bicycle ();
		moy.setOwnerName("April");
		moy.setTagNo("2022");
		
		

		owner1= bike1.getOwnerName();
		owner2= bike2.getOwnerName();
    tagNo=bike3.getTagNo();
		owner=moy.getOwnerName();
		tagNo=moy.getTagNo();
		
		System.out.println(owner1 + " owns a bicycle.");
		System.out.println(owner2 + " also owns a bicycle.");
		System.out.println("2004-134R");
		System.out.println(owner+ " " + tagNo);
	}
	

}
