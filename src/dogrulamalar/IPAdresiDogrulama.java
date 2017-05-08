/**
 * 
 */
package dogrulamalar;

import java.util.regex.PatternSyntaxException;

import javax.swing.JOptionPane;

/**
 * @author Emrah Denizer
 *
 */
public class IPAdresiDogrulama {

	public static void main(String[] args) {
		try {
			String girilenIp = JOptionPane
					.showInputDialog("Bir IpV4 adresi girin");
			if (girilenIp.matches("\\b(25[0-5]|2[0-4][0-9]"
					+ "|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?"
					+ "[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9]"
					+ "[0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b")) {
				JOptionPane.showMessageDialog(null, girilenIp
						+ " dogru IpV4 adresi girildi");
			} else {
				JOptionPane.showMessageDialog(null, girilenIp
						+ " yanlýþ IpV4 adresi girildi");
			}
		} catch (PatternSyntaxException ex) {
			ex.printStackTrace();

		}

	}

}
