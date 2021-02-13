public class nilai {
		
		private String nama;
		private int nilai;
		private String keterangan;
		private String indeks;
		private String predikat;
		
		public nilai() {}
		public nilai(String keterangan, String indeks, String predikat) {
			this.keterangan = keterangan;
			this.indeks = indeks;
			this.predikat = predikat;
		}
		public void setNilai(int nilai) {
			this.nilai = nilai;
		}
		public void setNama(String nama) {
			this.nama = nama;
		}
		public void setKet(String keterangan) {
			this.keterangan = keterangan;
		}
		public void setIndeks(String indeks) {
			this.indeks = indeks;
		}
		public void setPredikat(String Predikat) {
			this.predikat = predikat;
		}
		public String getNama() {
			return nama;
		}
		public int getNilai() {
			return nilai;
		}
		public String getKet() {
			return keterangan;
		}
		public String getIndeks() {
			return indeks;
		}
		public String getPredikat() {
			return predikat;
		}
	}