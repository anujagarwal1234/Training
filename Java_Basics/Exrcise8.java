import java.util.Scanner;

public class Exrcise8 
{
	static boolean checkNumber(int number)
	{
		if(number%2==0)
			return true;

		else 
			return false;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		int number;
		System.out.println("Enter a number : ");
		Scanner obj = new Scanner(System.in);
		number = obj.nextInt();
		System.out.println(checkNumber(number));

	}

}
