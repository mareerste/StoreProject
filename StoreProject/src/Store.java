import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Store {

	public static void main(String[] args) {
		 
		
		ArrayList<HashMap<String, String>> inventory = createInventory();
		
		System.out.println("Unesite parametar pretrage:");
		Scanner scanner = new Scanner(System.in);
		String searchText = scanner.nextLine();
		
		for (HashMap<String, String> p : inventory) {
			if (p.get("name").toLowerCase().contains(searchText.toLowerCase())) {
				System.out.println("\n");
				System.out.println("Name: " + p.get("name"));
				System.out.println("Price: " + p.get("price"));
				System.out.println("Quantity: " + p.get("quantity"));
			}
		}
		

	}

	private static ArrayList<HashMap<String, String>> createInventory() {
		ArrayList<HashMap<String, String>> inventory = new ArrayList<>();
		
		inventory.add(createProduct("Tastatura YY", "3999", "5"));
		inventory.add(createProduct("Tastatura XT", "4200", "5"));
		inventory.add(createProduct("Tastatura 433", "2499", "4"));
		inventory.add(createProduct("Pegla XX", "1990", "7"));
		inventory.add(createProduct("TV samsung 3", "8000", "2"));
		return inventory;
	}

	private static HashMap<String, String> createProduct(String name, String price, String quantity ) {
		HashMap<String, String> product = new HashMap<>();
		product.put("name", name);
		product.put("price", price);
		product.put("quantity", quantity);
		return product;
	}

}
