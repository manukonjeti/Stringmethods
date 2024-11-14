package mypackage;

public class StringMethods {

	public static void main(String[] args) {
		String str = "java";
		String str1 = "Java";
		//length of string
		System.out.println(str.length());
		//comparsion according to dictionary
		System.out.println(str.compareTo(str1));
		//character at index '0'
		System.out.println(str.charAt(0));
		//contains
		System.out.println(str.contains("av"));
		//equals
		System.out.println(str.equals(str1));
		//equals to ignore the case
		System.out.println(str.equalsIgnoreCase(str1));
		//trim--remove space
		System.out.println(str.trim());
		//replace
		System.out.println(str.replace('a','c'));
		//substring

		System.out.println(str.substring(2));

		System.out.println(str.substring(1,4));

		System.out.println(str.startsWith("j"));
		System.out.println(str.endsWith("a"));
		
	}

}
