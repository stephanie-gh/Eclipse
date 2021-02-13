package soal2;

public class encapsulation {

	private String nama;
	private String prodi;
	private String nim;
	
	public String getNama(){
	return this.nama; 
	}
	
	public String getProdi(){
	return this.prodi; 
	}
	
	public String getNim(){
	return this.nim; 
	}

	public void ModifNama(String nama){
	this.nama=nama;
	};
	
	public void ModifProdi(String prodi){
	this.prodi=prodi;
	}
	
	public void ModifNim(String nim){
	this.nim=nim;
	}
}
