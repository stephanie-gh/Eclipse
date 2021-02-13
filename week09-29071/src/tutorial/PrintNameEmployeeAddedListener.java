package tutorial;

public class PrintNameEmployeeAddedListener implements EmployeeAddedListener {

	@Override
	public void onEmployeeAdded(Employee employee) {
		//print nama karyawan yg baru ditambahkan
		System.out.println("Ditambahkan karyawan baru dengan posisi '"+employee.getPosition()+"' bernama '"+employee.getName()+"'");

	}
}