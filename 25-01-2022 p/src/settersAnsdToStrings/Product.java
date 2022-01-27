package settersAnsdToStrings;

public class Product 
{
	String prodName;
	int prodPrice;
	String prodManPlace;
	
	public Product()
	{
		
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}

	public void setProdManPlace(String prodManPlace) {
		this.prodManPlace = prodManPlace;
	}

	@Override
	public String toString() {
		return "Product [prodName=" + prodName + ", prodPrice=" + prodPrice + ", prodManPlace=" + prodManPlace + "]";
	}	
	
	public static void main(String[] args)
	{
		Product p = new Product();
		
		p.setProdName("Johnson & Johnson");
		p.setProdPrice(2500);
		p.setProdManPlace("Hyderabad");
		
		System.out.println(p);
	}
}
