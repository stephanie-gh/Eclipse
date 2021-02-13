package Tugas1;

import java.util.Scanner;

import model.Handphone;
import model.Voucher;

public class Main {

	static Handphone[] handphones = new Handphone[2];
	
	public static void seedDataHP() {
		handphones[0] = new Handphone("1","Samsung S9+ Hitam",14499000,10,"Hitam");
		handphones[1] = new Handphone("2","IPhone X Hitam",17999000,10,"Hitam");
	}
	
	static Voucher[] vouchers = new Voucher[1];
	
	public static void seedDataVoucher() {
		vouchers[0] = new Voucher("1","Google Play",22.000,100,0.1);
	}
	
	public static void mainMenu() {
		System.out.println("-------Daftar Barang Toko VOucher & HP--------");
		System.out.println("1. Handphone");
		System.out.println("2. Voucher");
	}
	
	public static void showDataHP() {
		System.out.println("Daftar Handphone");
		for(Handphone h : handphones) {
			System.out.println("---------------------------------------");
			System.out.println("ID		: "+h.getId());
			System.out.println("Nama	: "+h.getNama());
			System.out.println("Stock	: "+h.getStok());
			System.out.println("Harga	: "+h.getHarga());
		}
	}
	

	public static void showDataVoucher() {
		System.out.println("Daftar Voucher");
		for(Voucher v : vouchers) {
			System.out.println("---------------------------------------");
			System.out.println("ID		: "+v.getId());
			System.out.println("Nama	: "+v.getNama());
			System.out.println("Nominal	: "+v.getHarga());
			System.out.println("Stock	: "+v.getStok());
			System.out.println("Harga	: "+v.getHarga());
		}
	}

	public static void filterDataHP(String id) {
		Scanner s = new Scanner(System.in);
		for(Handphone h : handphones) {
			if(h.getId().contains(id)) {
			System.out.println("Pesan Barang (ID)	:"+h.getId());
			System.out.print("Masukkan Jumlah		:");
			h.jumlah = s.nextInt();
			if(h.getJumlah() >= h.getStok()) {
				System.out.println("Stock tidak mencukupi!\n"); break;
			}
			System.out.println(h.getJumlah()+" @ "+h.getNama()+" dengan total harga "+h.getTotal());
			System.out.print("Masukkan Jumlah Uang	:");
			h.uang = s.nextInt();
			if(h.uang >= h.getTotal()) {
				System.out.println("Berhasil dipesan!\n"); break;
			}else {
				System.out.println("Jumlah uang tidak mencukupi\n"); break;
			}
		}
	}
}

	public static void filterDataVoucher(String id) {
		Scanner s = new Scanner(System.in);
		for(Voucher v : vouchers) {
			if(v.getId().contains(id)) {
			System.out.println("Pesan Barang (ID)	:"+v.getId());
			System.out.print("Masukkan Jumlah		:");
			v.getJumlah = s.nextInt();
			if(v.getJumlah >= v.getStok()) {
				System.out.println("Stock tidak mencukupi!\n"); break;
			}
			System.out.println(v.getJumlah()+" @ "+v.getNama()+" dengan total harga "+v.getTotal());
			System.out.print("Masukkan Jumlah Uang	:");v.uang = s.nextInt();
			if(v.uang >= v.getTotal()) {
				System.out.println("Berhasil dipesan!\n"); break;
			}else {
				System.out.println("Jumlah uang tidak mencukupi\n"); break;
			}
		}
	}
}

	public static void showOrderHp() {
		for(Handphone h : handphones) {
			System.out.println("ID		:"+h.getId());
			System.out.println("Nama		:"+h.getNama());
			System.out.println("Jumlah		:"+h.getJumlah());
			System.out.println("Total		:"+h.getTotal());
			System.out.println("---------------------------------------"); break;
		}
	}

	public static void showOrderVoucher() {
		for(Voucher v : vouchers) {
			System.out.println("ID		:"+v.getId());
			System.out.println("Nama		:"+v.getNama());
			System.out.println("Jumlah		:"+v.getJumlah());
			System.out.println("Total		:"+v.getTotal());
			System.out.println("---------------------------------------"); break;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		seedDataHP();
		seedDataVoucher();
		for(;;) {
			System.out.println("----------Menu Toko Voucher & HP----------");
			System.out.println("1.Pesan Barang");
			System.out.println("2.Lihat Pesanan");
			System.out.println("3.Barang Baru");
			System.out.print("Pilihan : ");
			int  menu = in.nextInt();
			switch(menu) {
				case 1: 
					System.out.println("-------Daftar Barang Toko VOucher & HP--------");
					System.out.println("1. Handphone");
					System.out.println("2. Voucher");
					System.out.print("Pilihan : ");
					int  menyu = in.nextInt();
					
					switch(menyu) {
					case 1 :
						seedDataHP();
						showDataHP();
						System.out.print("Ketik 0 untuk batal"); 
						int batal = in.nextInt();
						
						switch(batal) {
						case 0 :
							break;
						case 1 :
							filterDataHP("1");break;
						case 2 :
							filterDataHP("2");break;
					}break;
					
					case 2 :
						seedDataVoucher();
						showDataVoucher();
						System.out.print("Ketik 0 untuk batal"); 
						int batall = in.nextInt();
						
						switch(batall) {
						case 0 :
							break;
						case 1 :
							filterDataVoucher("1");break;
					}break;
				}break;
				
			case 2 :
				showOrderHp();
				showOrderVoucher();
				break;
				
			case 3 :
				Scanner s = new Scanner(System.in);
				System.out.print("Voucher(1) / Handphone(2) : "); 
				int pilih = in.nextInt();
				
				switch(pilih) {
				case 1 :
					for(Voucher v : vouchers) {
						System.out.print("Nama : "); 
						v.nama = s.nextLine();
						System.out.print("Harga : "); 
						v.harga = s.nextInt();
						System.out.print("Stock : "); 
						v.stok = s.nextInt();
						System.out.print("PPN : "); 
						v.pajak = s.nextDouble();
						System.out.println("Voucher telah berhasil diinput!\n"); break;
					}break;
				
				case 2 :
					for(Handphone h : handphones) {
						System.out.print("Nama : "); 
						h.nama = s.nextLine();
						System.out.print("Harga : "); 
						h.harga = s.nextInt();
						System.out.print("Stock : "); 
						h.stok = s.nextInt();
						System.out.print("Warna : "); 
						h.warna = s.nextLine();
						System.out.println("Handphone telah berhasil diinput!\n"); 
						break;
					}break;
			}
				
			default :
				System.out.println("\n");
			}
		}
	}
}
