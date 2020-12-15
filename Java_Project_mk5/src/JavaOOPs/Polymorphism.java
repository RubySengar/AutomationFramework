package JavaOOPs;

public class Polymorphism {
	
	String name = "Tiger";
	String category = "Carnivores";
	
	public String  Animal() {
		System.out.println("polymorphism began");
		return name + " " +  category ;
		
	}
	
	public void habitat(String type, int quantity) {
		System.out.println("compile type polymorphism");
		System.out.println(type + " " + quantity);
		
	}

}
