class Document{
	String title, filepath;
	//setter
	void setter(String t, String fp)
	{
		this.title=t;
		this.filepath=fp;
	}
	//getter
	void showDocument()
	{
		System.out.println(title);
		System.out.println(filepath);
	}
}
public class Exercise1 {

	public static void main(String[] args) {
		Document obj = new Document();
		obj.setter("java basics","c:/document/corejava/basics/introduction.pdf");
		obj.showDocument();

	}

}
