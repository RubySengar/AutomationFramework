package AccessControlEncapsulation;

public class Product {

	protected int productId;
	protected String productName;
	protected float price;

	// Getters and Setters

	public Product(int productId, String productName, float price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public int getProductId() {

		return productId;
	}

	
	  public void setProductId(int productId) 
	  {
		  this.productId = productId;
		  
	  }
	 

	public String getProductName() {
		// System.out.println("Entered in ProductName");
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;

	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;

	}

	// Constructor

	public Product() {

	}

	// Write the method to calculate discount as 12% of price

	public float calculateDiscount() {

		/*
		 * // discount = (float) (0.12 * this.getPrice()); price = (float) (0.12 *
		 * price);
		 * 
		 * return price;
		 */
		
		return (float) (0.12 * this.price); 
	}

}
