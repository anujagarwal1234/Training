public class StringMethods {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str = "    hello    ";
		String str2 = "hello";
		Integer n=10;
		System.out.println(str1.charAt(4));
        System.out.println(str1.concat(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.length());
        System.out.println(str1.replace("e","f"));
        System.out.println(str1.substring(2));
        System.out.println(n.toString());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str.trim());
	}

}
