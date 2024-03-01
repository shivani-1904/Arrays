
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
class Utility {
	public static int fahrenheitToCelcius(double farhenheit) {

		int c = (int)(farhenheit - 32)*5/9 ;
		return c;
	}
	
	public static String getLevel(int[] array) {
		int s =0;

		for(int i=0; i<array.length;i++)
		{
			s = s+ array[i];
		}

		String l= "Invalid Option";

		if(s>=100){
			l="HIGH";
	
		}
		else if(s>=70 && s<100){
			l= "MEDIUM";
		}
		else if(s<70){
			l="LOW";
		}
		return l;
	}
}
public class Source {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		Utility obj = new Utility();

		if(x==1)
		{
			double temp = sc.nextDouble();
			
			int celc = obj.fahrenheitToCelcius(temp);
			System.out.println(celc);
		}
		else if(x==2)
		{
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<n;i++)
			{
				arr[i] = sc.nextInt();
			}

			String level = obj.getLevel(arr);
			System.out.println(level);
		}
		else{
			System.out.println("Invalid Option");
		}
	}
}
