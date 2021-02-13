public class StaffAkademik extends Karyawan{

	public StaffAkademik(String name, int pendapatanTetap) {
		super(name, pendapatanTetap);
		
	}
	
	public int getPendapatan(int flatBonus) {
		return this.pendapatanTetap + flatBonus;
	}
	
}