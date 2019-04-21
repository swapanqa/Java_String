package java_StringMethod;

public class StringMethodExample {

	public static void main(String[] args) {
		
		String s1 = "Shifa Shafee";
		
		//will convert string in lower case
		System.out.println(s1.toLowerCase());
		
		System.out.println("------------------------------");
		
		System.out.println(s1.toUpperCase());
		
		System.out.println("---------------------------------------");
		
		//Will return positive number if match found otherwise negative number
		
		System.out.println(s1.indexOf("f"));
		System.out.println(s1.indexOf("e"));
		
		System.out.println("--------------------------------------------");
		
		
		String s2 = "shifa, is ,my, daughter";
		
		String [] splitData = s2.split(",");
		
		System.out.print(splitData[0]);
		System.out.print(splitData[1]);
		System.out.print(splitData[2]);
		System.out.print(splitData[3]);
		
		

	}

}
