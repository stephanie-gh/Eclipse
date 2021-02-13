package week07.stephanie.id.ac.umn;

public class Employee {

		private String kode;
		private String nama;
		private int gaji;
		public String manager;
		public String karyawan;
		public String magang;
		public String getNama;
		
		public Employee(String kode, String nama, int gaji) {
			this.kode = kode;
			this.nama = nama;
			this.gaji = gaji;
		}
		
		
		public void setKode(String kode) {
			this.kode = kode;
		}
		public void setNama(String nama) {
			this.nama = nama;
		}
		public void setGaji(int gaji) {
			this.gaji = gaji;
		}
		public void setManager(String manager) {
			this.manager = manager;
		}
		public void setKaryawan(String karyawan) {
			this.karyawan = karyawan;
		}
		public void setMagang(String magang) {
			this.magang = magang;
		}
		
		//--------------------------------------------------//
		public String getKode() {
			return kode;
		}
		public String getNama() {
			return nama;
		}
		public int getGaji() {
			return gaji;
		}
		public String getManager() {
			return manager;
		}
		public String getKaryawan() {
			return karyawan;
		}
		public String getMagang() {
			return magang;
		}
	}
