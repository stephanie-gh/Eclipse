package soal2;

class StudentGrad extends Student {

    public void Write(int ID, int Grad, String Fname, String Lname, int yrGrad, String unSch, String major)
   {
       super.Write(ID, Grad, Fname, Lname);
       m_UndergradSchool = unSch;
       m_Major = major;
       m_Grad = Grad;
       YearGraduated = yrGrad;
    }
    public void Display(){
        super.Display();
        System.out.println("Graduated: " + m_Grad + " " + m_UndergradSchool + " " + m_Major + " " + YearGraduated);
    }   
    private Integer YearGraduated,m_Grad;
    private String m_UndergradSchool;
    private String m_Major;
}