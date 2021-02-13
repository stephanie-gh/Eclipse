package week06.stephanie.id.ac.umn;

public class Handphone {

		private String kode;
		private String nama;
		private int stock;
		private int harga;
		private int total;
		private int nominal;
		public int getJumlah;
		public int getUang;
		public String getWarna;
		public String getNama;
		public int getHarga;
		public int getStock;
		
		
		public Handphone() {}
		public Handphone(String kode, String nama, int stock, int harga) {
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
		public void setNominal(int nominal) {
			this.nominal = nominal;
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
		public void setWarna(String getWarna) {
			this.getWarna = getWarna;
		}
		public String getKode() {
			return kode;
		}
		public String getNama() {
			return nama;
		}
		public int getNominal() {
			return nominal;
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
		public String getWarna() {
			return getWarna;
		}

	}
