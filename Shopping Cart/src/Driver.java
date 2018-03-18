import java.util.*;
public class Driver 
{
	public static ArrayList<Item> menu= new ArrayList<Item>();
	public static  void itemGenerator()
	{
		Item toy = new Item("toy", "fun for kids", 3);
		Item car = new Item("car", "a race car", 13);
		Item banana = new Item("banana", "good source of potassium", 2);
		Item soda = new Item("orange fanta", "a delicious drink", 3);
		
		menu.add(car);
		menu.add(soda);
		menu.add(banana);
		menu.add(toy);
	}
	public static String listMenu()
	{
		return "available items: " + menu;
	}
	public static void menuPick(Customer current)
	{
		int x;
		Scanner in = new Scanner(System.in);
		System.out.println("pick the number for the item you want");
		x = in.nextInt();
		current.addItem(menu.get(x));
		in.close();
		
	}
	
	public static void main(String[] args) 
	{
		Customer jo = new Customer("jo", "geter", "Hodge Drive");
		System.out.println(jo.getAddress());
		jo.setAddress("Back Home");
		System.out.println(jo.getAddress());
		System.out.println(jo.toString());
		
		Driver.itemGenerator();
		System.out.println(Driver.listMenu());
		Driver.menuPick(jo);
		
		jo.addItem(menu.get(0));
		jo.addItem(menu.get(3));
		System.out.println(jo.viewCart());
		jo.removeItem(menu.get(3));
		System.out.println(jo.getTotal());
		System.out.println(jo.viewCart());
		jo.flushCart();

	}

}
