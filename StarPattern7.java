//Write a program to print given pattern
/*      *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
*/
package basicprogram;

public class StarPattern7 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i = i + 2) {// For row
			for (int j = 10; j >= i; j--) {// For Space
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {// For pattern
				System.out.print(" *");
			}
			System.out.println();// new line for next row
		}
	}
}
