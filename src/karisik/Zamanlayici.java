/**
 * 
 */
package karisik;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Emrah Denizer
 *
 */
public class Zamanlayici {

	public static void main(String[] args) {
		TimerTask task = new TimerTask() {
			int i;

			public void run() {
				i++;
				System.out.println(i + "-merhaba");
				if (i == 5) {
					System.exit(0);
				}

			}
		};
		Timer t = new Timer();
		t.schedule(task, 0, 10);

	}

}
