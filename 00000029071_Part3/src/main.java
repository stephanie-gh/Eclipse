import java.util.Scanner;

public class main {

	static nilai[] hasil = new nilai[6];
	
	public static void seedData() {
		hasil[0] = new nilai("Istimewa", "A", "LULUS");
		hasil[1] = new nilai("Amat Baik","B","LULUS");
		hasil[2] = new nilai("Baik","B","LULUS");
		hasil[3] = new nilai("Cukup","C","LULUS");
		hasil[4] = new nilai("Kurang","D","TIDAK LULUS");
		hasil[5] = new nilai("Sangat Kurang","E","TIDAK LULUS");
	}
	
//	public static void showData(String Predikat) {
//		System.out.println("Hasil");
//		for(nilai nilai : hasil) {
//			System.out.println("---------------------------------------");
//			System.out.println("Nama		: "+nilai.getNama());
//			System.out.println("Nilai		: "+nilai.getNilai());
//			System.out.println("Keterangan	: "+nilai.getKet());
//			System.out.println("Indeks		: "+nilai.getIndeks());
//			System.out.println("Predikat	: "+nilai.getPredikat());
//		}
//	}
//	
	public static void filterData(String predikat) {
		Scanner s = new Scanner(System.in);
		for(nilai ni : hasil) {
			System.out.println("Nama	:"+ni.getNama());
			System.out.println("Nilai	:"+ni.getNilai());
			System.out.println("Keterangan	:"+ni.getKet());
			System.out.println("Indeks	:"+ni.getIndeks());
			System.out.println("Predikat	:"+ni.getPredikat());
			if(ni.getNilai()>100) {
				System.out.println("Terjadi Kesalahan!\n"); break;
			}
		}
	}

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		seedData();
		int nilai;
		String nama;
			System.out.print("Nama : ");
			nama = in.nextLine();
			System.out.print("Nilai : ");
			nilai = in.nextInt();
			if(nilai>=90) {
				filterData("A");
			}else if(nilai>=80) {
				filterData("B");
			}else if(nilai>=70) {
				filterData("B");
			}else if(nilai>=60) {
				filterData("C");
			}else if(nilai>=50) {
				filterData("D");
			}else if(nilai<50) {
				filterData("E");
			}
		}
	}
