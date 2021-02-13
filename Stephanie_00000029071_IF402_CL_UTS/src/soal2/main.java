package soal2;

public class main {

	public static void main(String[] args) {
		encapsulation objek = new encapsulation();
        objek.ModifNama("Stephanie");
        objek.ModifNim("00000029071");
        objek.ModifProdi("Informatika");
        System.out.println("Nama : "+objek.getNama());
        System.out.println("NIM : "+objek.getNim());
        System.out.println("Prodi : "+objek.getProdi());
	}

}
