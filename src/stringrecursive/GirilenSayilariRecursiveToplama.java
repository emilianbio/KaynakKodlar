/**
 * 
 */
package stringrecursive;

import java.util.Scanner;

/**
 * @author Emrah Denizer
 *
 */
public class GirilenSayilariRecursiveToplama {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("toplanacak sayýyý giriniz:");
		int sayi = s.nextInt();
		System.out.println("sonuc:" + toplam(sayi));
	}

	public static int toplam(int sayi) {
		if (sayi == 0)
			return 0;
		else if (sayi == 1)
			return 1;
		else
			return sayi + toplam(sayi - 1);
	}

}
