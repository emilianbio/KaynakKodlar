/**
 * 
 */
package stringrecursive;


/**
 * @author Emrah Denizer
 *
 */
public class CumledekiKelimeSayisiniBulma {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println(kelimesayisi("em "));
		System.out.println(binarySearch(1));
		long a = 2147483647L;
		int b = 2147483647;
		System.out.println(a);
		long sum = 0L;
		for (int i = 0; i <= 3; i++) {
			sum += i;
			System.out.printf("%d'e kadar toplam: %d %n", i, sum);
		}
		int n = 1, w = 1;
		char[] ch = { 'A', 'n', 'k', 'a', 'r', 'a' };
		for (char c : ch) {
			w *= n;
			n++;
		}
		System.out.println(w);

	}

	public static int kelimesayisi(String cumle) {
		char bosluk = ' ';
		if (cumle.length() == 0)
			return 0;
		else {
			int sayac = 1;
			for (int i = 0; i < cumle.length(); i++) {
				if (cumle.charAt(i) == bosluk) {
					sayac++;

				}
			}
			return sayac;
		}
	}// i�inde arama yap�lacak olan dizi

	private static int[] array = { 1, 2, 3, 6, 7, 8, 9 };

	// ikili arama
	public static boolean binarySearch(int key) {
		int first = 0, last = array.length - 1, mid; // first=dizinin ba��,
														// last=dizinin sonu
		while (first <= last) {
			mid = first + (last - first) / 2; // ba�� first ve sonu last olan
												// alt dizinin orta eleman�n�
												// bul
			if (key == array[mid]) // orta eleman arad���m�z elemansa,
				return true; // bulduk: true ile geri d�n
			else if (key < array[mid]) // orta eleman arad���m�z elemandan
										// b�y�kse,
				last = mid - 1; // sol tarafa bakarak devam et
			else if (key > array[mid]) // orta eleman arad���m�z elemandan
										// k���kse
				first = mid + 1; // sa� tarafa bakarak devam et
		}
		return false; // bulamad�k: false d�nd�r
	}
}
