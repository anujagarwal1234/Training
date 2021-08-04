import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
		int n;
		int flag=0;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number : ");
		n = obj.nextInt();
		for(int i = 2; i < n; i++)
		{
			for(int j = 2; j < i; j++)
			{
				if(i%j==0)
				{
					flag = 1;
				}
				else
				{
					flag = 0;
				}
			}
			if(flag==1)
			{
				System.out.println(+i);
			}
		}
	}

}
