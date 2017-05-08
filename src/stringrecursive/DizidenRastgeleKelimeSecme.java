package stringrecursive;


public class DizidenRastgeleKelimeSecme {

	public static void rasgelekelime(String[] kelimeler){
		//Random r=new Random();
		int sayi=(int)(Math.random()*kelimeler.length);
		System.out.println("rasgele üretilen sayi:"+sayi);
		System.out.println("Rasgele seçilen kelime: "+kelimeler[sayi]);
		 
		}
	public static void main(String[] args) {
		String[] kelimeler={"ali","ata","bak"};
		rasgelekelime(kelimeler);
		}
	}


