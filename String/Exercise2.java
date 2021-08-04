class Member{
	String firstname,lastname,email,password,role;
	//setter
	void setter(String fn,String ln,String em,String pswd,String r)
	{
		this.firstname=fn;
		this.lastname=ln;
		this.email=em;
		this.password=pswd;
		this.role=r;
	}
	//getter
	void showMemberDetail()
	{
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(email);
		System.out.println(password);
		System.out.println(role);
	}
}
public class Exercise2 {
	public static void main(String args[])
	{
	 	Member obj = new Member();
	 	obj.setter("Pankaj", "Sharma", "sharma.pankaj@yash.com", "12345", "Trainer");
	 	obj.showMemberDetail();
	}

}
