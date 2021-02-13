package week05.stephanie.id.ac.umn;

public class Square {
	private int sisi;
	
	public Square(){}
	public Square(int sisi, String color){
		super ();
		this.sisi = sisi;
	}
	
	public double getSisi() {return sisi;}
	public double getArea() {return sisi * sisi;}
	public double getPerimeter() {return sisi * 4;}

}
