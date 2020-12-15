package JavaOOPs;

public class EncapsulationRun {
	
	public static void Encap() {
		
		System.out.println("Encapsulation Concept Began  >>>>>>>>>>>>>>>>>>>>>>>>>>>>" + "\n" + "Entered to next line" );
		Encapsulation ec = new Encapsulation();
		ec.setName("Ruby");
		ec.setAge(22);
		System.out.println("Clients name is >>> " + ec.getName());
		System.out.println("Clients age is >>> " + ec.getAge());
	}

}
