package week04.stephanie.id.ac.umn;

import java.util.Scanner;

public class Order {

	
	static Multiguna[] matkuls = new Multiguna[5];
	
	public static void seedData() {
		matkuls[0] = new Multiguna("1","Pulpen Easy Gel 0.5mm",120,2000);
		matkuls[1] = new Multiguna("2","Penggaris 30cm",30,5000);
		matkuls[2] = new Multiguna("3","Tipe-x Roller",30,7000);
		matkuls[3] = new Multiguna("4","Pensil Mekanik",50,5000);
		matkuls[4] = new Multiguna("5","Buku Tulis",100,6000);
	}
	
	public static void showData() {
		System.out.println("======================================");
		System.out.println("||  Daftar Barang Toko Multiguna    ||");
		System.out.println("======================================");
		for(Multiguna matkul : matkuls) {
			System.out.println("ID		:"+matkul.getKode());
			System.out.println("Nama		:"+matkul.getNama());
			System.out.println("Stock		:"+matkul.getStock());
			System.out.println("Harga		:"+matkul.getHarga());
			System.out.println("---------------------------------------");
		}
	}
	public static void filterData(String kode) {
		Scanner s = new Scanner(System.in);
		for(Multiguna matkul : matkuls) {
			if(matkul.getKode().contains(kode)) {
			System.out.println("Pesan Barang (ID)	:"+matkul.getKode());
			System.out.print("Masukkan Jumlah		:");
			matkul.getJumlah = s.nextInt();
			System.out.println(matkul.getJumlah()+" @ "+matkul.getNama()+" dengan total harga "+matkul.getTotal());
			System.out.print("Masukkan Jumlah Uang	:");
			matkul.getUang = s.nextInt();
			if(matkul.getUang >= matkul.getTotal()) {
				System.out.println("Berhasil dipesan!\n"); break;
			}else {
				System.out.println("Jumlah uang tidak mencukupi\n"); break;
			}
		}
	}
}
	public static void showOrder() {
		System.out.println("======================================");
		System.out.println("||  Daftar Pesanan Toko Multiguna   ||");
		System.out.println("======================================");
		for(Multiguna matkul : matkuls) {
			System.out.println("ID		:"+matkul.getKode());
			System.out.println("Nama		:"+matkul.getNama());
			System.out.println("Jumlah		:"+matkul.getJumlah());
			System.out.println("Total		:"+matkul.getTotal());
			System.out.println("---------------------------------------"); break;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		seedData();
		for(;;) {
			System.out.println("----------Menu Toko Multiguna----------");
			System.out.println("1.Pesan Barang");
			System.out.println("2.Lihat Barang");
			System.out.print("Pilihan : ");
			int  menu = in.nextInt();
			switch(menu) {
			case 1: 
				showData();
				System.out.print("Ketik 0 untuk batal"); int batal = in.nextInt();
				switch(batal) {
				case 0 :
					break;
				case 1 :
					filterData("1");break;
				case 2 :
					filterData("2");break;
				case 3 :
					filterData("3");break;
				case 4 :
					filterData("4");break;
				case 5 :
					filterData("5");break;
				}break;
			case 2 :
				showOrder();
			default :
				System.out.println("\n");
			}
		}
	}
}
