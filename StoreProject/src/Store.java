import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Store {

	public static void main(String[] args) {
		
		ArrayList<Product> inventory = createInventory();
		
//		Ispis totalne vrednosti inventorya
		
		int sum = 0;
		for (Product p : inventory) {
			double price = p.price;
			double quantity = p.quantity;
			sum += price * quantity;
			
		}
		
		System.out.println("Total value is: " + sum);
		
		
//		System.out.println("Unesite parametar pretrage:");
//		Scanner scanner = new Scanner(System.in);
//		String searchText = scanner.nextLine();
//		
//		for (HashMap<String, String> p : inventory) {
//			if (p.get("name").toLowerCase().contains(searchText.toLowerCase())) {
//				System.out.println("\n");
//				System.out.println("Name: " + p.get("name"));
//				System.out.println("Price: " + p.get("price"));
//				System.out.println("Quantity: " + p.get("quantity"));
//			}
//		}
		

	}

	private static ArrayList<Product> createInventory() {
		ArrayList<Product> inventory = new ArrayList<>();
		
		inventory.add(new Product("Tastatura YY",(double) 3999,(double) 5));
		inventory.add(new Product("Tastatura XT",(double) 4200,(double) 5));
		inventory.add(new Product("Tastatura 433",(double) 2499,(double) 4));
		inventory.add(new Product("Pegla XX",(double) 1990,(double) 7));
		inventory.add(new Product("TV samsung 3",(double) 8000,(double) 2));
		return inventory;
	}

}
