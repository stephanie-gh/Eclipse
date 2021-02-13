package tugas;

public class Credit extends Payment implements ClassInfo {

	protected int installment;
	protected int maxInstallmentAmount;
	protected int installmentAmount;
	
	public Credit() {}
	
	public Credit(Item item, int maxInstallmentAmount) {
		super(item);
		this.maxInstallmentAmount = maxInstallmentAmount;
		this.installment = 0;
	}

	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return "CREDIT";
	}

	@Override
	public int pay(int bayar) {
		// TODO Auto-generated method stub
		if(isPaidOff) {
			return 0;
		}
		
		installment = installment + bayar;
		
		if(installment == item.getPrice()) {
			isPaidOff = true;
			return 0;
		}
		return item.getPrice() / maxInstallmentAmount;
	}
	
	public int getRemainingAmount() {
		if(isPaidOff) {
			return 0;
		}
		return (this.item.getPrice() / maxInstallmentAmount);
	}
}
