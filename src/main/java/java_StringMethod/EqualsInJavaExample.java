package java_StringMethod;

public class EqualsInJavaExample {

	public static void main(String[] args) {
		 
		String s1 = "shifa";
		String s2 = "shifa";
		
		System.out.println(s1.equals(s2));
		
		
		String s3 = new String("shifa");
		String s4 = new String("shifa");
		System.out.println(s3.equals(s2));
		
		System.out.println(s3==s2);
		
		System.out.println(s3 == s4);
		
		System.out.println(s3.equals(s4));
		System.out.println(s1 == s2);

	}

}
