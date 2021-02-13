package mypackage;

public class Bulan {

	private String kode;
	private String tanggal;
	private String catatan;
	
	public Bulan() {}
	public Bulan(String kode,String tanggal, String catatan) {
		this.kode=kode;
		this.tanggal=tanggal;
		this.catatan=catatan;
	}
	
	public void setKodee(String kode) {
		this.kode=kode;
	}
	public void setTanggal(String tanggal) {
		this.tanggal=tanggal;
	}
	public void setCatatan(String catatan) {
		this.catatan=catatan;
	}
	
	public String getKode() {
		return kode;
	}
	public String getTanggal() {
		return tanggal;
	}
	public String getCatatan() {
		return catatan;
	}

}

