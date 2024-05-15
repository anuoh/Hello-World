package Day1;

public class Primeno {
	
	public static boolean isPrime(int num) {
		
		if(num<=1) {
			return false;
		}
	for(int i=2 ;i<num ;i++) {
		if(num%i==0) {
			return false;
		}
	}
		
	return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
		System.out.println(isPrime(5));
	}

}
