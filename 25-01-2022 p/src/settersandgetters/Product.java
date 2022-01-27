package settersandgetters;

public class Product 
{
	String prodName;
	int prodPrice;
	String prodManPlace;
	
	public Product()
	{
		
	}	

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getProdManPlace() {
		return prodManPlace;
	}

	public void setProdManPlace(String prodManPlace) {
		this.prodManPlace = prodManPlace;
	}

	public static void main(String[] args)
	{
		Product p = new Product();
		
		p.setProdName("Johnson & Johnson");
		p.setProdPrice(2500);
		p.setProdManPlace("Hyderabad");
		
		System.out.println(p.getProdName());
		System.out.println(p.getProdPrice());
		System.out.println(p.getProdManPlace());	

	}

}
