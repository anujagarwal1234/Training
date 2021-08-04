
public class Exercise1 {

	public static void main(String[] args) {
		int n=1234;
		int t;
		int sum = 0;
		while(n!=0)
		{
			t=n%10;
			sum = sum + t*t*t;
			n=n/10;
		}
		System.out.print("Output is : "+sum);
	}

}
