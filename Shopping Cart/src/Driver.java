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
		Driver.itemGenerator();
		
		Scanner scan = new Scanner(System.in);
		int input;
		boolean running = true;
		
		
		while(running)
		{
		System.out.println("Welcome to Menu:" + "\n"
		+ "To view Profile Press 1:" + "\n"
			+ "To view Cart Press 2:" + "\n"
		+ "To see Total Press 3:" + "\n"
			+ "To add Item Press 4:" + "\n"
		+ "To Remove Item Press 5:" + "\n"
			+ "To Flush Cart Press 6:" + "\n"
		+ "To Exit Press 0:");
		
			input = scan.nextInt();
			switch(input)
			{
				case 1 : System.out.println(jo.toString()); break;
				case 2 : System.out.println(jo.viewCart()); break;
				case 3 : System.out.println(jo.getTotal()); break;
				case 4 : System.out.println(Driver.listMenu());
				input = scan.nextInt();
					if(input == 0)
						jo.addItem(menu.get(0));
					else if(input == 1)
						jo.addItem(menu.get(1));
					else if(input == 2)
						jo.addItem(menu.get(2));
					else if(input == 3)
						jo.addItem(menu.get(3));
					break;
				case 5 : System.out.println(jo.viewCart());
				input = scan.nextInt();
					if(input == 0)
					jo.removeItem(menu.get(0));
					else if(input == 1)
						jo.removeItem(menu.get(1));
					else if(input == 2)
						jo.removeItem(menu.get(2));
					else if(input == 3)
						jo.removeItem(menu.get(3));
					break;
				case 6 : jo.flushCart(); break;
				case 0 : scan.close(); running = false; System.out.println("Goodbye"); break;
				default : System.out.println("Please enter accepted answers"); 
			}
		}
	}

}
