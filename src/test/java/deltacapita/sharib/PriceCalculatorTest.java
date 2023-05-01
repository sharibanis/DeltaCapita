package deltacapita.sharib;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class PriceCalculatorTest {
	
	private ArrayList<String> basketList = new ArrayList<String>();
	
	PriceCalculator priceCalculator = new PriceCalculator();
	
	@Test
	public void priceTestForNullBasket() {
		basketList = null;
		int basketCost = priceCalculator.calculateBaskedCost(basketList);
		assertEquals(-1, basketCost);
	}
	
	@Test
	public void priceTestForNullBasket2() {
		basketList = null;
		int basketCost = priceCalculator.calculateBaskedCost(basketList);
		assertEquals(-1, basketCost);
	}
	
	@Test
	public void priceTestForEmptyBasket() {
		int basketCost = priceCalculator.calculateBaskedCost(basketList);
		assertEquals(-1, basketCost);
	}
	
	@Test
	public void priceTestForApple() {
		basketList.add("Apple");
		int basketCost = priceCalculator.calculateBaskedCost(basketList);
		assertEquals(35, basketCost);
	}

	@Test
	public void priceTestForAppleAppleBanana() {
		basketList.add("Apple");
		basketList.add("Apple");
		basketList.add("Banana");
		int basketCost = priceCalculator.calculateBaskedCost(basketList);
		assertEquals(90, basketCost);
	}
	
	@Test
	public void priceTestForAppleAppleBananaMelon() {
		basketList.add("Apple");
		basketList.add("Apple");
		basketList.add("Banana");
		basketList.add("Melon");
		int basketCost = priceCalculator.calculateBaskedCost(basketList);
		assertEquals(140, basketCost);
	}
	
	@Test
	public void priceTestForAppleAppleBananaMelonMelon() {
		basketList.add("Apple");
		basketList.add("Apple");
		basketList.add("Banana");
		basketList.add("Melon");
		basketList.add("Melon");
		int basketCost = priceCalculator.calculateBaskedCost(basketList);
		assertEquals(140, basketCost);
	}
	
	@Test
	public void priceTestForAppleAppleBananaMelonMelonMelon() {
		basketList.add("Apple");
		basketList.add("Apple");
		basketList.add("Banana");
		basketList.add("Melon");
		basketList.add("Melon");
		basketList.add("Melon");
		int basketCost = priceCalculator.calculateBaskedCost(basketList);
		assertEquals(190, basketCost);
	}
	
	@Test
	public void priceTestForAppleAppleBananaMelonMelonMelonLime() {
		basketList.add("Apple");
		basketList.add("Apple");
		basketList.add("Banana");
		basketList.add("Melon");
		basketList.add("Melon");
		basketList.add("Melon");
		basketList.add("Lime");
		int basketCost = priceCalculator.calculateBaskedCost(basketList);
		assertEquals(205, basketCost);
	}
	
	@Test
	public void priceTestForAppleAppleBananaMelonMelonMelonLimeLime() {
		basketList.add("Apple");
		basketList.add("Apple");
		basketList.add("Banana");
		basketList.add("Melon");
		basketList.add("Melon");
		basketList.add("Melon");
		basketList.add("Lime");
		basketList.add("Lime");
		int basketCost = priceCalculator.calculateBaskedCost(basketList);
		assertEquals(220, basketCost);
	}
	
	@Test
	public void priceTestForAppleAppleBananaMelonMelonMelonLimeLimeLime() {
		basketList.add("Apple");
		basketList.add("Apple");
		basketList.add("Banana");
		basketList.add("Melon");
		basketList.add("Melon");
		basketList.add("Melon");
		basketList.add("Lime");
		basketList.add("Lime");
		basketList.add("Lime");
		int basketCost = priceCalculator.calculateBaskedCost(basketList);
		assertEquals(220, basketCost);
	}
	
	@Test
	public void priceTestForAppleAppleBananaMelonMelonMelonLimeLimeLimeLime() {
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
		int basketCost = priceCalculator.calculateBaskedCost(basketList);
		assertEquals(235, basketCost);
	}
}
