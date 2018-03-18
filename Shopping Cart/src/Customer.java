
public class Customer 
{
	private String firstName;
	private String lastName;
	private String address;
	private Cart cart;
	
	public Customer(String first, String last, String address)
	{
		firstName = first;
		lastName = last;
		this.address = address;
		this.cart = new Cart();
		
	}
	public void addItem(Item add)
	{
		cart.addItem(add);
	}
	public void removeItem(Item add)
	{
		cart.removeItem(add);
	}
	public void flushCart()
	{
		cart.flushCart();
	}
	public double getTotal()
	{
		return cart.getTotal();
	}
	public String viewCart()
	{
		return cart.ToString();
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String name)
	{
		firstName = name;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String name)
	{
		lastName = name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String toString()
	{
		String Output = "First: " + firstName +
				"\n" + "Last: " + lastName + "\n" +
				"Address: " + address;
		return Output;
	}


}
