package tugas;

public abstract class Payment implements ClassInfo {

	protected boolean isPaidOff;
	protected Item item;
	
	public abstract int pay(int bayar);
	
	public Payment() {
		this.isPaidOff = false;
		this.item = null;
	}
	public Payment(Item item) {
		this.isPaidOff = false;
		this.item = item;
	}
	public Item getItem() {
		return item;
	}
	public String getItemName() {
		return item.getName();
	}
	public String getItemType() {
		return item.getType();
	}
	public String getStatus() {
		if(isPaidOff) {
			return "FINISHED";
		}
		return "ON PROGRESS";
	}
	public int getRemainingAmount() {
		if(isPaidOff) {
			return 0;
		}
		return item.getPrice();
	}
	public boolean getPaidOff() {
		return isPaidOff;
	}
}
