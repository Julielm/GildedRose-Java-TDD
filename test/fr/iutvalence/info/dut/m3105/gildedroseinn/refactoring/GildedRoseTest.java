package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void qualityAndSellInOfItemShouldDecreaseByOneEveryday()
	{
		testUpdateItem(new ItemForTest(new Item("Bonjour", 30, 20),29,19));
	}

	@Test
	public void ifSellInIsPastSellInShouldDecreaseByOneAndQualityByTwoEveryday()
	{
		testUpdateItem(new ItemForTest(new Item("Bonjour", -2, 25),-3,23));
	}
	
	@Test
	public void qualityHasToBePositive()
	{
		testUpdateItem(new ItemForTest(new Item("Bonjour", 25, 1),24,0));
		testUpdateItem(new ItemForTest(new Item("Bonjour", -1, 1),-2,0));
		
	}
	
	@Test
	public void qualityOfAgedBrieIncreasesUntilFifty()
	{
		testUpdateItem(new ItemForTest(new Item("Aged Brie", 25, 23),24,24));
		testUpdateItem(new ItemForTest(new Item("Aged Brie", 25, 50),24,50));
	}
	
	@Test
	public void ifItemIsSulfurasItNeverAlters()
	{
		testUpdateItem(new ItemForTest(new Item("Sulfuras, Hand of Ragnaros", 0, 80),0,80));
	}
	
	private void testUpdateItem(ItemForTest itemForTest)
	{
		GildedRose.updateItem(itemForTest.getItemForTest());
		assertEquals(itemForTest.getItemForTest().getSellIn(), itemForTest.getSellInResult());
		assertEquals(itemForTest.getItemForTest().getQuality(), itemForTest.getQualityResult());
	}
}