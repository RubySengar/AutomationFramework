package JavaOOPs;

public class PolymorphismRun extends Polymorphism {
	
	String name = "Lion";
	
	@Override
	public String  Animal() {
		
		return name;
	}
	
	public void habitat(String type, String feed) {
		
		System.out.println(type + " " + feed);
	}
	
	public static void polymor() {
		
		System.out.println("Polymorphism Concept Began  >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		PolymorphismRun polrun = new PolymorphismRun();
		System.out.println(polrun.Animal());
		polrun.habitat("Omnivores", 54);
		polrun.habitat("Herbivores", "Grass");
		
	}

}
