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
		
		inventory.add(createProduct("Tastatura YY", 3999, 5));
		inventory.add(createProduct("Tastatura XT", 4200, 5));
		inventory.add(createProduct("Tastatura 433", 2499, 4));
		inventory.add(createProduct("Pegla XX", 1990, 7));
		inventory.add(createProduct("TV samsung 3", 8000, 2));
		return inventory;
	}

	private static Product createProduct(String name, double price, double quantity ) {
		Product product = new Product();
		product.name = name;
		product.price = price;
		product.quantity = quantity;
		return product;
	}

}
