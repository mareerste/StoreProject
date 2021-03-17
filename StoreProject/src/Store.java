import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Store {

	public static void main(String[] args) {
		
		ArrayList<Product> inventory = createInventory();
		
		pocetniMeni();
		
		System.out.println("Enter your value: ");
		Scanner mainScanner = new Scanner(System.in);
		int searchText = mainScanner.nextInt();
		
		while (searchText != 0) {
			
			if (searchText == 1) {
				
				for (Product p : inventory) {
					System.out.println("\n");
					System.out.println("Name: " + p.name);
					System.out.println("Price: " + p.price);
					System.out.println("Quantity: " + p.quantity);
				} mainScanner.nextInt();
				
			} else if (searchText == 2) {
				System.out.println("Unesite parametar pretrage:");
				Scanner scanner = new Scanner(System.in);
				String searchInventory = scanner.nextLine();
				
				for (Product p : inventory) {
					if (p.name.toLowerCase().contains(searchInventory.toLowerCase())) {
						System.out.println("\n");
						System.out.println("Name: " + p.name);
						System.out.println("Price: " + p.price);
						System.out.println("Quantity: " + p.quantity);
					}
				}
			} else if (searchText == 3) {
				int sum = 0;
				for (Product p : inventory) {
					double price = p.price;
					double quantity = p.quantity;
					sum += price * quantity;
				}
				System.out.println("Total value is: " + sum);
				break;
			} else {
				System.out.println("Not a valid Option..");
				System.out.println("Enter your value: ");
				mainScanner.nextInt();
			}
			
		}

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
	
	public static void pocetniMeni() {
		System.out.println("--- Welcome to Our Store ---");
		System.out.println("- 1) All Inventory");
		System.out.println("- 2) Search Inventory");
		System.out.println("- 3) Inventory value");
		System.out.println("- 0) Exit");
	}

}
