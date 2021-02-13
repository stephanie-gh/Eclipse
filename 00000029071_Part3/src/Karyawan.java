
public class Karyawan {

	protected String name;
	protected int pendapatanTetap;
	public StaffAkademik(String name, int pendapatanTetap) {
		this.name = name;
		this.pendapatanTetap = pendapatanTetap;
	}
	public String getName() {return this.name;}
	public int getPendapatan() {return this.pendapatanTetap;}
}