package myPackage;

public class CEO extends Pekerja{
	public CEO() {}
	
	public void tanyaIdentitas() {
		//upcasting
		System.out.println("Saya seorang CEO");
	}
	
	public void tanyaPendapatn() {
		//downcasting
		System.out.println("Pendapatan saya 100jt per bulan");
	}
}