import java.math.BigInteger;


public class Fibonacci {
	
	public static BigInteger of(int n){
		BigInteger arr[] = new BigInteger[n+1];
		arr[0] = BigInteger.valueOf(0);
		arr[1] = BigInteger.valueOf(1);
		int i;
		for(i=2;i<=n;i++){
			arr[i] = arr[i-1].add(arr[i-2]) ;			
		}
		return arr[n];
	}
	
	public static void main(String[] args){
		int i;
		for(i=1;i<=200;i++){
			BigInteger num = of(i);
			System.out.println(i+":"+num);
			
		}
	}
	
}
