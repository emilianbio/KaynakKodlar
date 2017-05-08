/**
 * 
 */
package stringrecursive;

/**
 * @author Emrah Denizer
 *
 */
public class KelimedekiSesliHarfSayisiniBulma {

	/**
	 * 
	 */
	public KelimedekiSesliHarfSayisiniBulma() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(sesliharfsayisi("emrahdenizer"));
	}

	public static int sesliharfsayisi(String kelime) {
		String sesliharfler = "aeýioöuü";
		int adet = 0;
		for (int i = 0; i < kelime.length(); i++) {
			for (int j = 0; j < sesliharfler.length(); j++) {
				if (kelime.charAt(i) == sesliharfler.charAt(j))
					adet++;

			}

		}
		return adet;
	}

}
