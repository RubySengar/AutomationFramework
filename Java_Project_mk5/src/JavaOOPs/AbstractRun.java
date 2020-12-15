package JavaOOPs;

public class AbstractRun extends Abstract {
	
	String voice = "chrip";
	
	public  void animal() {
		System.out.println("Animal is a Bird");
	}
	
	public  String Sound() {
		return voice;
	}
	
	public static void abstracte() {
		
		System.out.println("Abstract concept began >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		AbstractRun absrun = new AbstractRun();
		absrun.animal();
		System.out.println(absrun.Sound());
		
	}

}
