package week05.stephanie.id.ac.umn;

public class Rectangle {
	private int panjang, lebar;
	
	public Rectangle(){}
	public Rectangle(int panjang, int lebar, String color){
		super ();
		this.panjang = panjang;
		this.lebar = lebar;
	}

	public int getPanjang() {return panjang;}
	public int getLebar() {return lebar;}
	public double getArea() {return panjang * lebar;}
	public double getPerimeter() {return 2 * (panjang+lebar);}

}
