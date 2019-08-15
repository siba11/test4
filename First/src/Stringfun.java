
public class Stringfun {

	public static void main(String[] args) {
		String str1=("My name is Madhurii");
		String str2=("My name is Nagineni");
		System.out.println(str1.charAt(1));
		
		System.out.println(str1.concat("Nagineni"));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.contains("ame"));
		System.out.println(str1.hashCode());

		System.out.println(str1.indexOf("n"));
	
		System.out.println(str1.indexOf("s", 6));
		System.out.println(str1.lastIndexOf("i"));
		System.out.println(str1.substring(1, 7));
		//data types
		//convert string into string
		String a="100";
		int b= Integer.parseInt(a);
		System.out.println(b);
		//convert int to string
		String c=String.valueOf(b);
		//convert ino boolen
		boolean d=Boolean.valueOf(str1);
		
	}

}
