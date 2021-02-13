package week04.stephanie.id.ac.umn;

public class Multiguna {
		
	private String kode;
	private String nama;
	private int stock;
	private int harga;
	private int total;
	public int getJumlah;
	public int getUang;
	
	public Multiguna() {}
	public Multiguna(String kode, String nama, int stock, int harga) {
		this.kode = kode;
		this.nama = nama;
		this.stock = stock;
		this.harga = harga;
	}
	public void setKode(String kode) {
		this.kode = kode;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setHarga(int harga) {
		this.harga = harga;
	}
	public void setTotal(int total) {
		this.total = getJumlah*harga;
	}
	public void setUang(int uang) {
		this.getUang = getUang;
	}
	public String getKode() {
		return kode;
	}
	public String getNama() {
		return nama;
	}
	public int getStock() {
		return stock;
	}
	public int getHarga() {
		return harga;
	}
	public int getJumlah() {
		return getJumlah;
	}
	public int getUang() {
		return getUang;
	}
	public int getTotal() {
		return getJumlah*harga;
	}
}