import java.util.ArrayList;
import java.util.Scanner;

import exceptions.AuthenticationException;
import exceptions.ExcessiveFailedLoginException;
import exceptions.InvalidPropertyException;

public class Main {

	static Scanner s = new Scanner(System.in);

	static ArrayList<User> listOfUser = new ArrayList<User>();

	public static void initialize() {
		listOfUser.add(new User("John", "Doe", 'L', "Jl. Merpati No.1 RT 1 RW 1, Banten", "admin", "admin"));
	}

	public static int handleLogin(String username, String password) {
		User userToBeLoggedIn = new User();
		boolean found = false;
		int index = 0;

		for(User u : listOfUser) {
			if(u.getUserName().equals(username)) {
				userToBeLoggedIn = u;
				found = true;
				index = listOfUser.indexOf(u);
				break;
			}
		}

		try {
			if(found == false) {
				throw new AuthenticationException();
			}else if(userToBeLoggedIn.login(username, password) == true) {
				System.out.println(userToBeLoggedIn.greeting());
				listOfUser.set(index, userToBeLoggedIn);
				return 1;
			}else {
				throw new AuthenticationException();
			}
		} catch(ExcessiveFailedLoginException e) {
			System.out.println("Anda telah mencapai jumlah batas login");
			return 2;
		} catch(AuthenticationException e) {
			System.out.println("Username / password salah");
			return 3;
		}
	}

	public static String prompt(String data) {
		Scanner s = new Scanner(System.in);
		System.out.print(data+" : ");
		return s.next();
	}

	public static void main(String args[]) {

		int opt;
		String sTemp1, sTemp2, sTemp3, sTemp4, sTemp5;
		Character cTemp1;

		initialize();

		for(;;) {
			System.out.println("\n1. Login");
			System.out.println("2. Sign Up");
			System.out.print("Pilihan : ");

			opt = s.nextInt();

			switch(opt) {
			case 1:
				for(;;) {
					System.out.print("Username : ");
					sTemp1 = s.next();
					System.out.print("Password : ");
					sTemp2 = s.next();

					int statusCode = handleLogin(sTemp1, sTemp2);

					if(statusCode == 1 || statusCode == 2) {
						break;
					}else {
						continue;
					}
				}

				break;

			case 2:
				for(;;) {
					sTemp1 = prompt("Nama Depan");
					sTemp2 = prompt("Nama Belakang");
					cTemp1 = prompt("Jenis Kelamin (L/P)").charAt(0);
					sTemp3 = prompt("Alamat");

					sTemp4 = prompt("Username");
					try {
						if(sTemp4.length() <= 8) {
							System.out.println("Username harus lebih dari 8 karakter");
							throw new InvalidPropertyException();
						}

						sTemp5 = prompt("Password");

						if(sTemp5.matches("[a-z0-9]{6,16}")) {
							System.out.println("Password harus mengandung huruf besar, angka, minimum 6 karakter dan maksimum 16 karakter");
							throw new InvalidPropertyException();
						}else if(sTemp5.matches("[a-zA-Z0-9]{6,16}")) {
							listOfUser.add(new User(sTemp1, sTemp2, cTemp1, sTemp3, sTemp4, sTemp5));
							System.out.println("User telah berhasil didaftarkan");
							break;
						}else {
							System.out.println("Password harus mengandung huruf besar, angka, minimum 6 karakter dan maksimum 16 karakter");
							throw new InvalidPropertyException();
						}
					}catch(InvalidPropertyException e) {
						continue;
					}

				}
				break;

			default:
				System.out.println("Invalid input");
				break;
			}
		}
	}
}
