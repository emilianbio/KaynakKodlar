/**
 * 
 */
package stringrecursive;

/**
 * @author Emrah Denizer
 *
 */
public class KelimedekiHarferleriAyirma {

	/**
	 * 
	 */
	public KelimedekiHarferleriAyirma() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ikiligrup("emrah");
	}

	public static void ikiligrup(String kelime) {
		String yeni = "";
		for (int i = 0; i < kelime.length(); i++) {
			yeni = yeni + kelime.charAt(i) ;

		}
		System.out.println(yeni);

	}
}
