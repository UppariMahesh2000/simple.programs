package simple.java.programs;

public class primeNumber {

	public static void main(String[] args) {
		int n =12;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.println(n+": yes it is prime number");
			}
			else {
				System.out.println(n+": it is  not prime number");
			}
		}
}
