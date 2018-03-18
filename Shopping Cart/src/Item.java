import java.util.ArrayList;

public class Item 
{
	private String name;
	private String description;
	private int price;
	
	public Item(String name, String description, int price)
	{
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public String toString()
	{
		return name;
	}
	public String getName()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
}
