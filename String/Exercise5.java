import java.util.Scanner;

class StringDemoTest{
	String getRequiredData(String i) {
		return i;
	}
}
public class Exercise5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		Scanner sc = new Scanner(System.in);
		input = sc.next();
		StringDemoTest obj = new StringDemoTest();
		System.out.println(obj.getRequiredData(input));
	}

}
