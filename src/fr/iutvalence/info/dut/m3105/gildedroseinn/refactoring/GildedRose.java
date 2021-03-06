package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import java.util.List;

public class GildedRose
{

	/*
	 * The code below is intended to help writing test fixtures
	 * 
	 * items = new ArrayList<Item>(); 
	 * items.add(new Item("+5 Dexterity Vest", 10, 20)); 
	 * items.add(new Item("Aged Brie", 2, 0)); 
	 * items.add(new Item("Elixir of the Mongoose", 5, 7)); 
	 * items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80)); 
	 * items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)); 
	 * items.add(new Item("Conjured Mana Cake", 3, 6));
	 */

	public static void updateItems(List<Item> items)
	{
		for (int indexInItemList = 0; indexInItemList < items.size(); indexInItemList++)
			updateItem(items.get(indexInItemList));
	}

	public static void updateItem(Item item)
	{	
		if ("Sulfuras, Hand of Ragnaros".equals(item.getName()))
		{
			return;
		}
		decrementItemSellIn(item);
		if ("Aged Brie".equals(item.getName()) && item.getQuality()<50)
		{
			incrementItemQuality(item);
		}
		if (item.getQuality() >0 && !"Aged Brie".equals(item.getName())) 
		{
			decrementItemQuality(item);
			if(item.getSellIn()<0 && item.getQuality()>0) {
				decrementItemQuality(item);
			}
		}
	}

	private static void decrementItemSellIn(Item item)
	{
		item.setSellIn(item.getSellIn()-1);
	}

	private static void decrementItemQuality(Item item)
	{
		item.setQuality(item.getQuality()-1);	
	}
	
	private static void incrementItemQuality(Item item)
	{
		item.setQuality(item.getQuality()+1);
	}

}
