
public class Exercise6 {

	public static void main(String[] args) {
		String Fname="Pankaj";
		String Lname="Sharma";
		String Company="Yash Technologies";
		String Role="Trainer";
		

		String password = Fname.substring(0, 2);
		password = password.concat(Lname.substring(0, 2));
		password = password.concat(Company.substring(0, 2));
		password = password.concat(Role.substring(0, 2));
		System.out.println(password);
		

	}

}
