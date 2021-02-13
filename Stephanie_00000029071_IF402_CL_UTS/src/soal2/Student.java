package soal2;

class Student {

	   public void Write(int ID, int Grad, String Fname, String Lname) {
	       m_ID = ID;
	       m_Graduation = Grad;
	       m_First = Fname;
	       m_Last = Lname;
	    }  
	   	public void Display()
	    {  
	        System.out.println( "Student: " + m_ID + "\n" + m_First + " " + m_Last + "\nGraduated: " + m_Graduation);
	    }  
	    private int m_ID, m_Graduation;  
	    private String m_First;  
	    private String m_Last;
	} 