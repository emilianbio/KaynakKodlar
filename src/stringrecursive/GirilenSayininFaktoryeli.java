/**
 * 
 */
package stringrecursive;

import java.util.Scanner;

/**
 * @author Emrah Denizer
 *
 */
public class GirilenSayininFaktoryeli {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Faktöriyeli hesaplanacak sayýyý giriniz:");
//		int sayi = s.nextInt();
//		System.out.println("sonuc: " + fak(sayi));
		
		 int u=1,A[]=new int[9999999];
	       @SuppressWarnings("resource")
		Scanner scan =new Scanner(System.in);
	       System.out.print("n=");
	      int n=scan.nextInt();
	      A[1]=1;
	    for(int i=1;i<=n;i++) 
	    {
	       for(int j=1;j<=n;j++) {
	            A[j]*=i;
	        }           
	       for(int j=1;j<=n;j++)
	       {
	         if(A[j]>9)
	          {
	          A[j+1]+=A[j]/10;
	          A[j]%=10;       
	          }
	         if(A[u+1]!=0) {
	               u++;
	           } 
	       }

	   }
	    System.out.print(n+"! in reqemleri sayi:"+u+"\n"+" Result: "+"\n");
	     for(int i=u;i>=1;i--)
	     {
	         System.out.print(A[i]);
	     }

	    }
	

	public static int fak(int sayi) {
		// if (sayi == 0)
		// return 1;
		// else if (sayi == 1)
		// return 1;
		// else if (sayi < 0)
		// return -1;
		// else
		// return sayi * fak(sayi - 1);

		int result = 1;
		for (int i = 0; i <= sayi; i++) {

			result = result * i;
		}
		return result;
	}

}
