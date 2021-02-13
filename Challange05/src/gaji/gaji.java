//Vera - 00000028777
//Stephanie - 00000029071


package gaji;

public class gaji{
	public static void main(String args []) { 
		A superOb = new A(); 
		B subOb = new B(); 
		// The superclass may be used by itself. 
		superOb.i = 2000000; 
		superOb.j = 2000000; 
		System.out.println("Gaji Pokok Pegawai: "); 
		superOb.showij(); 
		System.out.println();
		 /* The subclass has access to all public members of its superclass. */ 
		subOb.a = 250000; 
		subOb.b = 50000; 
		subOb.k = 3; //jumlah sks
		subOb.l = 14; //jumlah kehadiran
		subOb.c = superOb.i;
		subOb.d = superOb.j;
		System.out.println("Pembagian Biaya : "); 
		subOb.showbiaya(); 
		System.out.println(); 
		System.out.println("Total Gaji Pegawai :"); 
		subOb.sumA();
		subOb.sumB();
	} 
		

}

//A simple example of inheritance. 
//Create a superclass. 
class A { 
int i, j, a, b, c, d; 
void showij() { 
	System.out.println("Gaji A : " + i);
	System.out.println("Gaji B : " + j);
	} 

void showbiaya() { 
	System.out.println("Gaji A /sks  	 : " + a);
	System.out.println("Gaji B /kehadiran: " + b);
	} 
}

//Create a subclass by extending class A. 
class B extends A {
int i,k,l; 
void sumA() { 
	System.out.println("A : " + (c+(a*k))); }  
void sumB() { 
	System.out.println("B : " + (d+(b*l))); } 
}


