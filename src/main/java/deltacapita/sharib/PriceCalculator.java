package deltacapita.sharib;

import java.util.ArrayList;

public class PriceCalculator {
	
	final int priceApple = 35;
	final int priceBanana = 20;
	final int priceMelon = 50;
	final int priceLime = 15;
	final ArrayList<String> basketList = new ArrayList<String>();
	
	public int calculateBaskedCost(ArrayList<String> basketList) {
		int basketCost = 0;
		int countMelon = 0, countLime = 0;
		for (String item : basketList) {
			if (item.equals("Apple")) {
				basketCost += priceApple;
			} else if (item.equals("Banana")) {
				basketCost += priceBanana;
			} else if (item.equals("Melon")) {
				countMelon++;
			} else if (item.equals("Lime")) {
				countLime++;
			} else {
			}
		}
		if (countMelon == 1) {
			basketCost += priceMelon;
		} else if (countMelon > 1) {
			if (countMelon % 2 == 0) {
				basketCost += (countMelon / 2) * priceMelon;
			} else {
				basketCost += (countMelon / 2) * priceMelon + priceMelon;
			}
		} else {}
		
		if (countLime == 1) {
			basketCost += priceLime;
		} else if (countLime == 2) {
			basketCost += 2 * priceLime;
		} else if (countLime > 2) {
			if (countLime % 3 == 0) {
				basketCost += 2 * priceLime;
			} else {
				basketCost += (countLime - 2) * priceLime + priceLime;
			}
		} else {}
		
		return basketCost;
	}
	
/*	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Invaid arguments: "+args);
			System.exit(0);
		}
		
		for (String arg : args) {
			basketList.add(arg);
		}
		
		basketList.add("Apple");
		basketList.add("Apple");
		basketList.add("Banana");
		basketList.add("Melon");
		basketList.add("Melon");
		basketList.add("Melon");
		basketList.add("Lime");
		basketList.add("Lime");
		basketList.add("Lime");
		basketList.add("Lime");
		
		int basketCost = calculateBaskedCost(basketList);
		System.out.println("The cost of the basket is: "+basketCost+"p");
	}*/
}