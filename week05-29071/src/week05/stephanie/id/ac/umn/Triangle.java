package week05.stephanie.id.ac.umn;

public class Triangle {
	private int alas, tinggi;
	
	public Triangle(){}
	public Triangle(int alas, int tinggi, String color){
		super ();
		this.alas = alas;
		this.tinggi = tinggi;
	}
	public int getAlas() {return alas;}
	public int getTinggi() {return tinggi;}
	public double getArea() {return (alas * tinggi) / 2;}
	public double getPerimeter() {return alas + tinggi + Math.sqrt((alas*alas)+(tinggi*tinggi)) ;}

}
