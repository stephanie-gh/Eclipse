package week02.stephanie.id.ac.umn;

import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		
		Scanner scanner = new Scanner(System.in);

		  System.out.println("Masukkan angka : ");
		  number = scanner.nextInt();
		  
		  int temp;
		  boolean prima = true;
		  
		 
		  for(int pembagi = 2; pembagi <= number / 2; pembagi++){
		   
		   temp = number % pembagi;
		   
		   if(temp == 0){
		    
		    prima = false;
		    break;
		    
		   }
		  
		  }
		  
		  /*
		   Jika prima adalah true dan number yang diberikan user
		   bukanlah 0 dan 1
		   */
		  if(prima && ((number > 0)&&(number != 1)))
		   System.out.println("Angka " + number + " adalah bilangan prima");
		  else
		   System.out.println("Angka " + number + " bukanlah bilangan prima");
	}
}
