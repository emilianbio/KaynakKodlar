/**
 * 
 */
package stringrecursive;

/**
 * @author Emrah Denizer
 *
 */
public class KelimedekiEnCokTekrarEdenHarf {

	public static void main(String[] args) {
		encokharf("emrahdenizer");
		 
	}

	public static void encokharf(String kelime) {
		int adet = 0;
		int encok = 0;
		int indis = 0;
		for (int i = 0; i < kelime.length(); i++) {
			adet = 0;
			for (int j = 0; j < kelime.length(); j++) {
				if (kelime.charAt(i) == kelime.charAt(j))
					adet++;
			}
			if (adet > encok) {
				encok = adet;
				indis = i;
			}

		}
		System.out.println("en çok kullanýlan harf:" + kelime.charAt(indis));
		System.out.println("tekrar sayýsý:" + encok);
	}
}
