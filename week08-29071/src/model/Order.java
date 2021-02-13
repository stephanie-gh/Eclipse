package model;

public class Order {

	private String id;
	private static int jumlah;
	private static int total;
	
	Order(){}
	Order(int id, int jumlah){
		super();
		this.jumlah = jumlah;
		this.total = total;
	}

	public void setId() {
		this.id = id;
	}
	public void setJumlah() {
		this.jumlah = jumlah;
	}
	
	public String getId() {
		return id;
	}
	public static Object getVoucher() {
		return getVoucher();
	}
	public static Object getHandphone() {
		return getHandphone();
	}
	public static int getJumlah() {
		return jumlah;
	}
}
