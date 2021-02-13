package week06.stephanie.id.ac.umn;

public class Voucher {

		private String kode;
		private String nama;
		private int stock;
		private int harga;
		private int total;
		private int nominal;
		public int getJumlah;
		public int getUang;
		public double getPpn;
		public String getNama;
		public int getHarga;
		public int getStock;
		
		
		public Voucher() {}
		public Voucher(String kode, String nama, int nominal, int stock, int harga) {
			this.kode = kode;
			this.nama = nama;
			this.nominal = nominal;
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
		public void setPpn(double ppn) {
			this.getPpn = getPpn;
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
		public double getPpn() {
			return getPpn;
		}

	}
