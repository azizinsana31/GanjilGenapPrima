public class Main {
	public static void main(String[] args) {
		
		int index = 0;
		int jumlahGenap = 0;
		int jumlahGanjil = 0;
		int jumlahPrima = 0;
		String inputedString = "12345";		
		int[] arr = new int[inputedString.length()];
		
		// Mengekstrak inputan string ke dalam array.
		for(String str : inputedString.split("")) {
			arr[index] = Integer.parseInt(str);
			index++;
		}
		
		// Mencari Nilai Ganjil & Genap
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) { ++jumlahGenap; }
			else { ++jumlahGanjil; }
		}
		
		// Mencari Nilai Prima
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) { 
				if(arr[i] % 3 != 0) {
					++jumlahPrima;
				}
			}
		}
		
		System.out.println("Jumlah Ganjil : " + jumlahGanjil);
		System.out.println("Jumlah Genap : " + jumlahGenap);
		System.out.println("Jumlah Prima : " + jumlahPrima);
	}
}
