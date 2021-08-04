class Category
{
	String id, name, createdDate;
	//setter
	void setter(String i, String n, String cd )
	{
		this.id=i;
		this.name=n;
		this.createdDate=cd;
	}
	//getter
	void showCategoryDetail()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(createdDate);
	}
}
public class Exercise4 {

	public static void main(String[] args) {
		Category obj = new Category();
		obj.setter("101", "javabasics", "31-01-2017");
		obj.showCategoryDetail();

	}

}
