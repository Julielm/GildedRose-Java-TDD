package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void qualityAndSellInOfItemShouldDecreaseByOneEveryday()
	{
		Item item = new Item("Bonjour", 30,20);
		GildedRose.updateItem(item);
		assertEquals(item.getSellIn(), 29);
		assertEquals(item.getQuality(),19);
	}
	
}