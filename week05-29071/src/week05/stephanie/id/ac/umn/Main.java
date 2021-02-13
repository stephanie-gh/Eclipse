package week05.stephanie.id.ac.umn;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		menu();
	}

	private static void menu() {
		Scanner s = new Scanner(System.in);
		
		int menu;
		
		System.out.println("-----Program Menghitung Bangun Ruang-----");
		System.out.println("1.Lingkaran");
		System.out.println("2.Persegi");
		System.out.println("3.Persegi Panjang");
		System.out.println("4.Segitiga");
		System.out.println("5.Keluar");
		System.out.print("Pilihan : ");
		menu = s.nextInt();
		
		switch(menu){
		case 1 :
			Circle();
			break;
		case 2 :
			Square();
			break;
		case 3 :
			Rectangle();
			break;
		case 4 :
			Triangle();
			break;
		case 5 :
			System.out.println("Keluar Program...");
			break;
		default :
			System.out.println("Input tidak valid");
			break;
		}
	}
	
	private static void Circle() {
		Scanner s = new Scanner(System.in);

		System.out.println("----------Lingkaran----------");
		System.out.print("Masukkan Jari-Jari Lingkaran : ");
		double radius = s.nextDouble();
		System.out.print("Masukkan Warna : ");
		String color = s.next();
		
		Circle circle = new Circle(radius,color);
		System.out.println("Jari-Jari : "+circle.getRadius());
		System.out.println("Keliling Lingkaran : "+circle.getPerimeter());
		System.out.println("Luas Lingkaran : "+circle.getArea());
		
	}
	
	private static void Square() {
		Scanner s = new Scanner(System.in);

		System.out.println("----------Persegi----------");
		System.out.print("Masukkan Panjang Sisi : ");
		int sisi = s.nextInt();
		System.out.print("Warna : ");
		String color = s.next();
		
		Square square = new Square(sisi,color);
		System.out.println("Panjang Sisi : "+square.getSisi());
		System.out.println("Keliling Persegi : "+square.getPerimeter());
		System.out.println("Luas Persegi : "+square.getArea());
		
	}
	
	private static void Rectangle() {
		Scanner s = new Scanner(System.in);

		System.out.println("----------Persegi Panjang----------");
		System.out.print("Masukkan Panjang : ");
		int panjang = s.nextInt();
		System.out.print("Masukkan Lebar : ");
		int lebar = s.nextInt();
		System.out.print("Warna : ");
		String color = s.next();
		
		Rectangle rectangle = new Rectangle(panjang,lebar,color);
		System.out.println("Panjang & Lebar : "+rectangle.getPanjang()+" & "+rectangle.getLebar());
		System.out.println("Keliling Persegi Panjang : "+rectangle.getPerimeter());
		System.out.println("Luas Persegi Panjang : "+rectangle.getArea());
		
	}
	
	private static void Triangle() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("----------Segitiga Siku-Siku----------");
		System.out.print("Masukkan Alas : ");
		int alas = s.nextInt();
		System.out.print("Masukkan tinggi : ");
		int tinggi = s.nextInt();
		System.out.print("Warna : ");
		String color = s.next();
		
		Triangle triangle = new Triangle(alas,tinggi,color);
		System.out.println("Alas & Tinggi : "+triangle.getAlas()+" & "+triangle.getTinggi());
		System.out.println("Keliling Segitiga : "+triangle.getPerimeter());
		System.out.println("Luas Segitiga : "+triangle.getArea());
		
	}

}
