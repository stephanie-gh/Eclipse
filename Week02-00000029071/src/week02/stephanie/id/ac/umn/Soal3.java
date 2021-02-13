package week02.stephanie.id.ac.umn;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min,max,sum;
		
		Scanner scanner = new Scanner(System.in);

		  System.out.println("Masukkan nilai terkecil : ");
		  min = scanner.nextInt();
		  
		  System.out.println("Masukkan nilai terbesar : ");
		  max = scanner.nextInt();
		  
		  int c = 0;

		     for (int i = min; i < max; i++) {
		         boolean isPrima = true;

		         for (int j = 2; j < i; j++) {
		             if(i%j==0){
		                 isPrima = false;
		                 //break;
		             }
		         }
		         if(isPrima==true){
		        	 c += i;
		    }
		} System.out.println("Jumlah dari semua nilai prima dari " + min + " sampai " + max + " adalah " + c);
	}
}