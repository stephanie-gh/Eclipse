package myPackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pekerja pekerja = new Pekerja();
		pekerja.tanyaIdentitas();
		
		//contoh upcasting
		pekerja = new CEO();
		pekerja.tanyaIdentitas();
		
		//contoh upcasting
		Karyawan karyawan = new Karyawan();
		pekerja = (Pekerja)karyawan;
		pekerja.tanyaIdentitas();
		
		//contoh downcasting
		CEO c = new CEO();
		Pekerja p = new CEO();
		c = (CEO)p;
		c.tanyaPendapatn();
	}

}
