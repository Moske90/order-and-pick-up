package projekat_1;

import java.util.Scanner;

public class ShopAndGo {

	public static void main(String[] args) {
//		Pasta Bar

		Scanner s = new Scanner(System.in);

		String[] regularCustomers = { "0631111111", "063222222", "063333333", "064444444", "065555555", "066666666" };
		String[] ingredients = { "Makarone", "Spagete", "Bolognes", "Curetina", "Govedja prsuta", "Slanina", "Piletina",
				"4 sira", "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos", "Napolitana", "Povrce mix", "Pecurke",
				"Kutija" };
		int[] price = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };

	}

	public static int findIngredient(String[] ingredients, String ingredient) {
		int index = 0;
		for (int i = 0; i < ingredients.length; i++) {
			if (ingredients[i].equals(ingredient)) {
				return index = i;
			}
		}
		if (ingredient.equals("Poruci")) {
			return index = -1;
		} else {
			return index = 16;
		}
	}
	
	public static boolean isRegularCustomer(String[] regularCustomers, String phoneNumber) {
		for (int i = 0; i < regularCustomers.length; i++) {
			if (regularCustomers[i].equals(phoneNumber)) {
				return true;
			}
		}
		return false;
	}
}
