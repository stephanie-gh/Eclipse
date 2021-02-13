package model;

public class Handphone extends Barang {

	public String warna;
	public int jumlah;
	public int uang;
	private static int total;
	
	Handphone(){}
	public Handphone(String id, String nama, double harga, int stok, String warna){
		super();
		this.warna = warna;
	}

	public void setWarna() {
		this.warna = warna;
	}
	
	public String getWarna() {
		return warna;
	}
	public int getJumlah() {
		return Order.getJumlah();
	}
	public double getTotal() {
		return getHarga()*getJumlah();
	}
	public double getUang() {
		return uang;
	}
}
