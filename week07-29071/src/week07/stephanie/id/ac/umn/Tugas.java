package week07.stephanie.id.ac.umn;

import java.util.Scanner;

public class Tugas{
	
	static Employee[] employees = new Employee[3];

	public static void seedDataEmployee() {
		employees[0] = new Employee("M1","Stephanie",10000000);
	}
	
	public static void mainMenu() {
		System.out.println("-------Program Data Karyawan--------");
		System.out.println("1. Lihat Karyawan");
		System.out.println("2. Tambah Karyawan");
		System.out.println("3. Keluar");
	}
	
	public static void showEmployee() {
		System.out.println("-------Daftar Manajer--------");
		for(Employee e : employees) {
			System.out.println("ID	: "+e.getKode());
			System.out.println("Nama	: "+e.getNama());
			System.out.println("Gaji	: "+e.getGaji());
			System.out.println("---------------------------------------");
		}
	}
	
	public static void main(String args []) { 
		Scanner in = new Scanner(System.in);
		seedDataEmployee();
		A superOb = new A(); 
		B subOb = new B(); 
		//The superclass may be used by itself. 
		superOb.i = 10000000; 
		superOb.j = 3000000; 
		superOb.k = 1500000; 
		superOb.mainMenu();
		System.out.print("Pilihan : ");
		int  menu = in.nextInt();
		System.out.println();
		 /* The subclass has access to all public members of its superclass. */ 
		subOb.a = "M1"; 
		subOb.b = "R1"; 
		subOb.c = "I1";
		subOb.i = superOb.i;
		subOb.k = superOb.j;
		subOb.l = superOb.k;
		
		switch(menu) {
		case 1 :
			System.out.println("-------Daftar Manager-------");
			subOb.Manager();
			System.out.println("-------Daftar Karyawan Tetap-------");
			subOb.Karyawan();
			System.out.println("-------Daftar Magang-------");
			subOb.Magang();
			break;
		case 2 :
			subOb.addEmployee();
			break;
			
		case 3 :
			System.out.print("\n");
		}
	}
		

}

class A {
Scanner in = new Scanner(System.in);
int i, j, k;
String a,b,c;
void mainMenu() { 
	System.out.println("-------Program Data Karyawan--------");
	System.out.println("1. Lihat Karyawan");
	System.out.println("2. Tambah Karyawan");
	System.out.println("3. Keluar");
	} 
void addEmployee() {
	System.out.println("-------Tambah Karyawan--------");
	System.out.println("1. Manager");
	System.out.println("2. Karyawan Tetap");
	System.out.println("3. Magang");
	System.out.print("Pilihan : ");
	int  tambah = in.nextInt();
	System.out.println();
	
	switch(tambah) {
	case 1 :
		System.out.print("Nama : ");
		String manager = in.nextLine();
		System.out.println("Manajer baru telah ditambahkan");break;
	case 2 :
		System.out.print("Nama : ");
		String karyawan = in.nextLine();
		System.out.println("Manajer baru telah ditambahkan");break;
	case 3 :
		System.out.print("Nama : ");
		String magang = in.nextLine();
		System.out.println("Manajer baru telah ditambahkan");break;
		}
	}
}


//Create a subclass by extending class A. 
class B extends A {
static Employee[] employees = new Employee[3];
int i,k,l; 
void Manager() {
	System.out.println("ID : " + a);
//	System.out.println("Nama: " + e.getManager());
	System.out.println("Gaji: " + i); }
void Karyawan() { 
	System.out.println("ID : " + b);
//	System.out.println("Nama: " + e.getKaryawan());
	System.out.println("Gaji: " + k); }
void Magang() { 
	System.out.println("ID : " + c);
//	System.out.println("Nama: " + e.getMagang());
	System.out.println("Gaji: " + l); } 
}
