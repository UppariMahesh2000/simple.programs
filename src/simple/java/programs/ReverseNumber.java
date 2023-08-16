package simple.java.programs;

public class ReverseNumber {

	public static void main(String[] args) {
		int n =12345 ,rev=0,rem;
		while(n!=0) {
		    rem=n%10;
			rev=rem+(rev*10);
			n=n/10;
		}
		System.out.println(rev);
	}
}
