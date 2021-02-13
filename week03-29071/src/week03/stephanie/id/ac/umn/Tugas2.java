package week03.stephanie.id.ac.umn;

import java.util.Scanner;

public class Tugas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan Nama Anda : ");
		String nama = scanner.nextLine();
		
		System.out.print("-----------------------------------------");
		
		String[] ApaSaja = new String[10];
		
		ApaSaja[0] = "1.charAt";
		ApaSaja[1] = "2.length";
		ApaSaja[2] = "3.substring(n)";
		ApaSaja[3] = "4.substring(m,n)";
		ApaSaja[4] = "5.contains";
		ApaSaja[5] = "6.concat";
		ApaSaja[6] = "7.replace";
		ApaSaja[7] = "8.split";
		ApaSaja[8] = "9.lowerCase";
		ApaSaja[9] = "10.upperCase";
		
		System.out.println("\nString anda : "+nama); show(ApaSaja);
		System.out.print("Pilih menu : ");
		int menu = scanner.nextInt();
		
		String nm1 = (nama);
		
		switch(menu) {
		case 1 :
			System.out.print("-----charAt-----\n");
			System.out.println("Nama : "+nama);
			System.out.print("Input : ");
			int input = scanner.nextInt();
			System.out.println("Hasil : "+nm1.charAt(input)); 
			break;
		case 2 :
			System.out.print("-----length-----\n");
			System.out.println("Nama : "+nama);
			System.out.print("Input : "+nm1.length()); break;
		case 3 :
			System.out.print("-----substring(n)-----\n");
			System.out.println("Nama : "+nama);
			System.out.print("Input : ");
			int input2 = scanner.nextInt();
			System.out.println("Hasil : "+nm1.substring(input2)); break;
		case 4 :
			System.out.print("-----substring(m,n)-----\n");
			System.out.println("Nama : "+nama);
			System.out.print("Input mulai : ");
			int mulai = scanner.nextInt();
			System.out.print("Input akhir : ");
			int akhir = scanner.nextInt();
			System.out.println("Hasil : "+nm1.substring(mulai, akhir)); break;
		case 5 :
			System.out.print("-----contains-----\n");
			System.out.println("Nama : "+nama);
			System.out.print("Input : ");
			String mengandung = scanner.next();
			System.out.println("Hasil : "+nm1.contains(mengandung)); break;
		case 6 :
			System.out.print("-----concat-----\n");
			System.out.println("Nama : "+nama);
			System.out.print("Input : ");
			String tambah = scanner.next();
			System.out.println("Hasil : "+nm1.concat(" - "+tambah)); break;
		case 7 :
			System.out.print("-----replace-----\n");
			System.out.println("Nama : "+nama);
			System.out.print("Input kata yang diganti : ");
			String diganti = scanner.next();
			System.out.print("Input kata yang diganti : ");
			String pengganti = scanner.next();
			System.out.println("Hasil : "+nm1.replace(diganti, pengganti)); break;
		case 8 :
			System.out.print("-----split-----\n");
			System.out.println("Nama : "+nama);
			System.out.print("Input : ");
			String huruf = scanner.next();
			String[] splitStrings = huruf.split(" ");
			System.out.println("Hasil : "+nm1.split(huruf, 5)); break;
		case 9 :
			System.out.print("-----lowerCase-----\n");
			System.out.println("Nama : "+nama);
			System.out.println("Hasil : "+nm1.toLowerCase()); break;
		case 10 :
			System.out.print("-----upperCase-----\n");
			System.out.println("Nama : "+nama);
			System.out.println("Hasil : "+nm1.toUpperCase()); break;

		}
	}
	public static void show(String menus[]) {
		for(int i=0;i<menus.length;i++) {
			System.out.println("- "+menus[i]);
		}
	}
}