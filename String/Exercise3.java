class Section
{
	String id, name,createdDate;
	//setter
	void setter(String i, String n, String cd)
	{
		this.id=i;
		this.name=n;
		this.createdDate=cd;
	}
	//getter
	void showSectionDetail()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(createdDate);
	}
}
public class Exercise3 {

	public static void main(String[] args) {
	Section obj = new Section();
	obj.setter("101", "core_java", "31-01-2017");
	obj.showSectionDetail();
	}

}
