package CognizantOOPs;

public class Sphere extends Shape{
	
	private int radius;
	
	public double calculateVolume() {
		
		double volume = 0;
		
		volume = (4*3.14*radius*radius*radius)/3;		
		return volume;	
		
	}
	
	
	public Sphere() {
		
	}
	
	public Sphere(int radius1) {
		
		this.radius = radius1;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
