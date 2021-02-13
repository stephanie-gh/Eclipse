package week02.stephanie.id.ac.umn;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		Scanner scanner = new Scanner(System.in);
		
		String[] bulan = {
				
		};
		
		System.out.print("Masukkan bulan(1-12) : ");
		input = scanner.nextInt();
		
		switch(input) {
		case 1: System.out.println("Bulan Januari memiliki 31 hari"); show(bulan); break;
		case 2: System.out.println("Bulan Februari memiliki 28 hari"); show(bulan); break;
		case 3: System.out.println("Bulan Maret memiliki 31 hari"); show(bulan); break;
		case 4: System.out.println("Bulan April memiliki 30 hari"); show(bulan); break;
		case 5: System.out.println("Bulan Mei memiliki 31 hari"); show(bulan); break;
		case 6: System.out.println("Bulan Juni memiliki 30 hari"); show(bulan); break;
		case 7: System.out.println("Bulan Juli memiliki 31 hari"); show(bulan); break;
		case 8: System.out.println("Bulan Agustus memiliki 31 hari"); show(bulan); break;
		case 9: System.out.println("Bulan September memiliki 30 hari"); show(bulan); break;
		case 10: System.out.println("Bulan Oktober memiliki 30 hari"); show(bulan); break;
		case 11: System.out.println("Bulan November memiliki 30 hari"); show(bulan); break;
		case 12: System.out.println("Bulan Desember memiliki 31 hari"); show(bulan); break;
		default: System.out.println("Pilih yang bener dong! Gimana seh!");
		}
	}
	
	public static void show(String[] bulan) {
		for(String eachMonth : bulan) {
			System.out.println(eachMonth);
		}
	}
}
