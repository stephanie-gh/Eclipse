package model;

public class Barang {

	private String id;
	public double harga;
	public String nama;
	public int stok;
	
	Barang(){}
	Barang(String id, String nama, double harga){
		this.id=id;
		this.nama=nama;
		this.harga=harga;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setHarga(double harga) {
		this.harga = harga;
	}
	public void minusStok(int jml) {
		this.stok = stok;
	}
	
	public String getId() {
		return id;
	}
	public String getNama() {
		return nama;
	}
	public double getHarga() {
		return harga;
	}
	public int getStok() {
		return stok;
	}
	public int minusStok() {
		return stok-Order.getJumlah();
	}
	public Object Voucher() {
		return Order.getVoucher();
	}
	public Object Handphone() {
		return Order.getHandphone();
	}

}
