package JavaAdvanced;

public class Constructore {
	
	String name = "";
	
	protected Constructore (String name) {
		
		this.name = name;
		System.out.println("Parameterized Constructor has covered in the tutorials");
	}
	
	protected Constructore() {
		System.out.println("No Argument Constructor is also covered in the tutorials");
	}
	
	static void info() {
		
		System.out.println("Working on Constructors");
	}

	public static void construct() {
		
		Constructore cns = new Constructore("Shivalik");
		System.out.println(cns.name);
		//cns.info();
		info();
		new Constructore();
	
		
	}
}
 