public class Dosen extends Karyawan{
	protected int jumlahBimbingan;

	public Dosen(String name, int pendapatanTetap, int jumlahBimbingan) {
		super(name, pendapatanTetap, jumlahBimbingan);
		this.jumlahBimbingan = jumlahBimbingan;
	}

	public int getPendapatan(){
		return this.pendapatanTetap+ (this.jumlahBimbingan * 100000);
	}

}
