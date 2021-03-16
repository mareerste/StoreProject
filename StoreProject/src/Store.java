import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Store {

	public static void main(String[] args) {
		
		
		ArrayList<HashMap<String, String>> inventory = new ArrayList<>();
		
		HashMap<String, String> product = new HashMap<>();
		product.put("name", "Tastatyura XZ");
		product.put("price", "3999");
		product.put("quantity", "3");
		inventory.add(product);
		
		product = new HashMap<>();
		product.put("name", "Tastatyura XY");
		product.put("price", "3000");
		product.put("quantity", "5");
		inventory.add(product);
		
		
//		inventory.add("Tastatyura XZ");
//		inventory.add("Tastatyura YY");
//		inventory.add("Televizor LG KY");
//		inventory.add("Televizor Samsung X");
//		inventory.add("Ves masina 12");
//		inventory.add("Ves masina YY");
//		inventory.add("Ves masina X4");
//		inventory.add("Pegla TT");
//		inventory.add("Pegla TX");
		
		
		
		System.out.println("Unesite parametar pretrage:");
		Scanner scanner = new Scanner(System.in);
		String searchText = scanner.nextLine();
		
		for (HashMap<String, String> p : inventory) {
			if (p.toLowerCase().contains(searchText.toLowerCase())) {
				System.out.println(p);
			}
		}
		

	}

}
