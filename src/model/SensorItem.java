package model;

public class SensorItem {
	private int itemId;
	private String itemName;
	public SensorItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SensorItem(int itemId, String itemName) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	@Override
	public String toString() {
		return "SensorItem [itemId=" + itemId + ", itemName=" + itemName + "]";
	}
	

}
