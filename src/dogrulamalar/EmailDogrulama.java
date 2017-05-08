/**
 * 
 */
package dogrulamalar;

import javax.swing.JOptionPane;

/**
 * @author Emrah Denizer
 *
 */
public class EmailDogrulama {

	/**
	 * 
	 */
	public EmailDogrulama() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("E-mail adresinizi girin");
		// (?simx)\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b
		// girilend egerin email olup olmadigini kontrol ediyor
		if (email.matches("(?simx)\\b[A-Z0-9._%+-]+"
				+ "@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b")) {
			System.out.println(email + " email adresidir");
		} else {
			System.out.println(email + " email degil");
		}
	}

}
