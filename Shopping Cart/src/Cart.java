import java.util.*;
public class Cart 
{
	private ArrayList<Item> cartList = new ArrayList<Item>();
	public Cart()
	{
		
	}
	public void addItem(Item add)
	{
		cartList.add(add);
	}
	public void removeItem(Item add)
	{
		cartList.remove(add);
	}
	public void flushCart()
	{
		cartList.clear();
	}
	public double getTotal()
	{
		int size = cartList.size();
		int count = 0;
		double total = 0;
		while(size > count)
		{
			total += cartList.get(count).getPrice();
			count++;
			
		}
		return total;
		
	}
	public String ToString()
	{
		return "Cart contains " + cartList;
	}

}
