package klausurvorbereitung;

public class ArrayAddierer {
	public static void main(String[] args) {
		int[] zahl1 = {1,8,8};
		int[] zahl2 = {3,4,1};
		System.out.print(addiere(zahl1, zahl2)[2]);
	}
	
	public static int[] addiere(int[] a, int[] b) {
		int i = a.length-1;
		int dec = 0;
		int result = 0;
		
		for (; i>=0; i--) {
			result = result + (int)( (a[i] + b[i])*Math.pow(10, dec));
			dec++;
		}
		
		int alength = 0;
		int counter = result;
		while (counter > 0) {
			counter = counter/10;
			alength++;
			System.out.println(counter);
		}
		
		int[] ergebnis = new int[alength];
		counter = result;
		while(counter > 0) {
			ergebnis[alength-1] = counter%10;
			counter = counter/10;
			alength--;
		}
		return ergebnis;
	}
}
