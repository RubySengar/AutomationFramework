package AccessControlEncapsulation;

public class ElectronicProduct extends Product {
	
	private String  dimension;
	private int  warranty;
	Product prd ;
	
	
	//Constructor
	public ElectronicProduct(int productId, String productName, float price,String dimension, int warranty) {
		
		//Uncomment this statement if you inherit the Product class
		
		//new Product(productId, productName, price);
		super(productId, productName, price);
		this.dimension = dimension;
		this.warranty = warranty;
	}
	public ElectronicProduct()
	{
	    
	}
	
	//Getters and Setters
	
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}	

	//Override the calculateDiscount method to calculate the discount as 25% of price
	
	@Override
	public float calculateDiscount()
	{
		
		
		/*
		 * float price = 0 ;
		 * 
		 * price = (float) (0.25 * this.getPrice()); //discount = (float) (0.25 *
		 * price); return price;
		 */
		
		//return (float) (0.25 * this.getPrice()); 
		
		return ((this.getPrice()*25)/100);
		
		
		 
		
		
	}

}
