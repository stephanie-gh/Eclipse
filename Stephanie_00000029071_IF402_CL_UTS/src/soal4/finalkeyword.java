package soal4;

public class finalkeyword {

	private final int max=5;
	private final int modal=5000;
	private static int a;
	public static void main(String[] args) {
		finalkeyword k = new finalkeyword();
		for(a=1;a<k.max;a++) {
			System.out.println("Harga Tissue " + a + " : " + k.modal*a);
		}

	}

}
