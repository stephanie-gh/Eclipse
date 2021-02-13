package model;

public class Voucher extends Barang{

	public double pajak;
	public int uang;
	public int getJumlah;
	private static int total;
	private String id;
	
	Voucher(){}
	public Voucher(String id, String nama, double harga, int stok, double pajak){
		super();
		this.pajak = pajak;
	}

	public void setPajak() {
		this.pajak = pajak;
	}
	
	public String getNama(String nama) {
		return nama;
	}
	public String getId(String id) {
		return id;
	}
	public double getPajak() {
		return pajak;
	}
	public double gethargaJual() {
		return getHarga();
	}
	public double getTotal() {
		return getHarga()*Order.getJumlah();
	}
	public double getUang() {
		return uang;
	}
	public int getJumlah() {
		return Order.getJumlah();
	}
}
