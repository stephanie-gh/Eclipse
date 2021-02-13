package tugas;

public class Cash extends Payment implements ClassInfo{
	
	public Cash(Item item) {
		super(item);
	}
	
	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return "CASH";
	}

	@Override
	public int pay(int bayar) {
		// TODO Auto-generated method stub
		if(isPaidOff) {
			return 0;
		}
		isPaidOff = true;
		return this.item.getPrice();
	}
}
