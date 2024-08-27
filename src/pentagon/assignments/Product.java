package pentagon.assignments;

public class Product
{
	String p_id;
	String p_name;
	int quantity;
	double price;
	public Product(String p_id, String p_name, int quantity, double price) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.quantity = quantity;
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return String.format("id,name,quantity,price");
		
	}
}
