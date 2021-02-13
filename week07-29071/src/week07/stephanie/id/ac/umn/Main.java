package week07.stephanie.id.ac.umn;

import java.util.Scanner;

public class Main {

	static Employee[] employees = new Employee[3];
	
	public static void seedDataEmployee() {
		employees[0] = new Employee("M1","Stephanie",10000000);
		employees[1] = new Employee("E1","Justine Christ",3000000);
		employees[2] = new Employee("P1","Mario Bross",1500000);
	}
	
	public static void mainMenu() {
		System.out.println("-------Program Data Karyawan--------");
		System.out.println("1. Lihat Karyawan");
		System.out.println("2. Tambah Karyawan");
		System.out.println("3. Keluar");
	}
	
	public static void addEmployee() {
		System.out.println("-------Tambah Karyawan--------");
		System.out.println("1. Manager");
		System.out.println("2. Karyawan Tetap");
		System.out.println("3. Magang");
	}
	
	public static void showEmployee() {
//		System.out.println("-------Daftar Manajer--------");
		for(Employee e : employees) {
			System.out.println("ID	: "+e.getKode());
			System.out.println("Nama	: "+e.getNama());
			System.out.println("Gaji	: "+e.getGaji());
			System.out.println("---------------------------------------");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		seedDataEmployee();

		for(;;) {
			mainMenu();
			System.out.print("Pilihan : ");
			int  menu = in.nextInt();
		
		switch(menu) {
		
//		case 1 :
//			for(Employee e : employees) {
//			showEmployee();
//			break;
//			}break;
//			
//		case 2 :
//			addEmployee();
//			Scanner s = new Scanner(System.in);
//			System.out.print("Pilihan : ");
//			int  tambah = in.nextInt();
//			switch(tambah) {
//			case 1 :
//				for(Employee e : employees) {
//					System.out.println("Nama	:"); e.getNama = s.nextLine();
//					System.out.println("Manager baru telah ditambahkan!");
//					break;
//				}
//			case 2 :
//				for(Employee e : employees) {
//					System.out.println("Nama	:"); e.getNama = s.nextLine();
//					System.out.println("Karyawan tetap baru telah ditambahkan!"); 
//				}
//				break;
//			case 3 :
//				for(Employee e : employees) {
//					System.out.println("Nama	:"); e.getNama = s.nextLine();
//					System.out.println("Karyawan magang baru telah ditambahkan!"); 
//				}
//				break;
//			}
//			break;
//		case 3 :
//			System.out.println("\n");
		
//		case 1 :
//			System.out.println("-------Daftar Manager-------");
//			subOb.Manager();
//			System.out.println("-------Daftar Karyawan Tetap-------");
//			subOb.Karyawan();
//			System.out.println("-------Daftar Magang-------");
//			subOb.Magang();
//			break;
//		case 2 :
//			subOb.addEmployee();
//			System.out.print("Pilihan : ");
//			int  tambah = in.nextInt();
//			System.out.println();
//			
//			switch(tambah) {
//			case 1 :
//				System.out.println("Nama : ");
//				String manager = in.nextLine();
//				System.out.println("Manajer baru telah ditambahkan");break;
//			case 2 :
//				System.out.println("Nama : ");
//				String karyawan = in.nextLine();
//				System.out.println("Manajer baru telah ditambahkan");break;
//			case 3 :
//				System.out.println("Nama : ");
//				String magang = in.nextLine();
//				System.out.println("Manajer baru telah ditambahkan");break;
//			}
//			break;
//			
//		case 3 :
//			System.out.print("\n");
			}
		}
	}
}
