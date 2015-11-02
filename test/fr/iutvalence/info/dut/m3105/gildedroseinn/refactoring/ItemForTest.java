package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

public class ItemForTest
{
	private Item itemForTest;
	private int sellInResult;
	private int qualityResult;
	
	public ItemForTest(Item item, int sellInResult, int qualityResult)
	{
		this.itemForTest= item;
		this.sellInResult=sellInResult;
		this.qualityResult=qualityResult;
		
	}

	public Item getItemForTest()
	{
		return this.itemForTest;
	}

	public int getSellInResult()
	{
		return this.sellInResult;
	}

	public int getQualityResult()
	{
		return this.qualityResult;
	}

}
